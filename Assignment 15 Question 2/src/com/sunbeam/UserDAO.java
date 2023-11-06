package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO implements AutoCloseable{
	private Connection con;
	private PreparedStatement saveStmt;
	private PreparedStatement findAllStmt;
	private PreparedStatement updateStmt;
	private PreparedStatement deleteByIdStmt;
	
	public UserDAO() throws Exception {
		this.con = DBUtil.getConnection();
		String sql="insert into users values(default,?,?,?,?,?,0,'voter')";
		this.saveStmt = con.prepareStatement(sql);
		String sql2="select * from users;";
		this.findAllStmt=con.prepareStatement(sql2);
		String sql3="update users set first_name=?,last_name=?,dob=?,email=?,password=? where id=?";
		this.updateStmt = con.prepareStatement(sql3);
		String sql4="delete from users where id=?";
		this.deleteByIdStmt = con.prepareStatement(sql4);
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
	public int save(User u) throws Exception {
		saveStmt.setString(1, u.getFirstName());
		saveStmt.setString(2, u.getLastName());
		saveStmt.setString(3,u.getEmail());
		saveStmt.setString(4, u.getPassword());
		java.util.Date uDate = u.getDob();
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		saveStmt.setDate(5, sDate);
		int count=saveStmt.executeUpdate();
		return count;
	}
	public int update(User u) throws Exception {
		updateStmt.setString(1, u.getFirstName());
		updateStmt.setString(2, u.getLastName());
		java.util.Date uDate = u.getDob();
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		updateStmt.setDate(3, sDate);
		updateStmt.setString(4, u.getEmail());
		updateStmt.setString(5, u.getPassword());
		updateStmt.setInt(6, u.getId());
			int count = updateStmt.executeUpdate();
			return count;
		} // stmt.close();
	
	public int deleteById(int id) throws Exception {
		deleteByIdStmt.setInt(1,id);
		int count=deleteByIdStmt.executeUpdate();
		return count;
	}
	public List<User> findAll() throws Exception {
		List<User> list = new ArrayList<User>();
		{
			try(ResultSet rs = findAllStmt.executeQuery())
			{
				while(rs.next())
				{
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password=rs.getString("password");
					String dateStr=rs.getString("dob");
					SimpleDateFormat sdf;
					sdf=new SimpleDateFormat("dd-MM-yyyy");
					java.util.Date uDate=sdf.parse(dateStr);	
					int status=rs.getInt("status");
					String role=rs.getString("role");
					User u = new User(id, fname,lname,email,password,uDate,status,role);
					list.add(u);
				}
			}
		}
		return list;
	}
	
			
	}

