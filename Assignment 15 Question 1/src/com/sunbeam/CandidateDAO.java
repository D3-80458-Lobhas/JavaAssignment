package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO implements AutoCloseable{
	private Connection con;
	private PreparedStatement findByIDStmt;
	private PreparedStatement findAllStmt;
	private PreparedStatement saveStmt;
	private PreparedStatement deleteByIdStmt;
	private PreparedStatement getPartywiseVotesStmt;
	
	
	public CandidateDAO() throws Exception {
		this.con = DBUtil.getConnection();
		String sql="select * from candidates where id = ?";
		this.findByIDStmt = con.prepareStatement(sql);
		this.findAllStmt = con.prepareStatement("select * from candidates");
		String sql2="insert into candidates values(default,?,?,?)";
		this.saveStmt = con.prepareStatement(sql2);
		String sql3="delete from candidates where id=?";
		this.deleteByIdStmt = con.prepareStatement(sql3);
		String sql4="select party,sum(votes)totalVotes from candidates group by party";
		this.getPartywiseVotesStmt=con.prepareStatement(sql4);
		
	}

	
	@Override
	public void close() throws Exception {
		try {
			if(con!=null)
				con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws Exception {
		saveStmt.setString(1, c.getName());
		saveStmt.setString(2,c.getParty());
		saveStmt.setInt(3, c.getVotes());
		int count=saveStmt.executeUpdate();
		return count;
	}
	public int update(Candidate c) throws Exception {
		String sql = "UPDATE candidates SET name=?, party=?, votes=? WHERE id=?";
		try( PreparedStatement stmt = con.prepareStatement(sql) ) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, c.getId());
			int count = stmt.executeUpdate();
			return count;
		} // stmt.close();
	}
	public int deleteById(int id) throws Exception {
		deleteByIdStmt.setInt(1,id);
		int count=deleteByIdStmt.executeUpdate();
		return count;
	}
	public Candidate findById(int id) throws Exception {
		findByIDStmt.setInt(1, id);
		Candidate c = new Candidate();
		try(ResultSet rs = findByIDStmt.executeQuery())
		{		rs.next();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setParty(rs.getString("party"));
				c.setVotes(rs.getInt("votes"));
			}
		return c;
				
		}
	
	public List<Candidate> findAll() throws Exception {
		List<Candidate> list = new ArrayList<Candidate>();
		{
			try(ResultSet rs = findAllStmt.executeQuery())
			{
				while(rs.next())
				{
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			}
		}
		return list;
	}
	public List<Candidate> findByParty(String party) throws Exception {
		List<Candidate> list = new ArrayList<Candidate>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, party);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
		
	}
	public List<PartyVotes> getPartywiseVotes() throws Exception
	{
		List<PartyVotes> lists = new ArrayList<PartyVotes>();
		{
			try(ResultSet rs = getPartywiseVotesStmt.executeQuery())
			{
				while(rs.next())
				{
					String party = rs.getString("party");
					int votes = rs.getInt("totalVotes");
					PartyVotes c = new PartyVotes(party, votes);
					lists.add(c);
				}
			}
		}
		return lists;
		
	}


}
