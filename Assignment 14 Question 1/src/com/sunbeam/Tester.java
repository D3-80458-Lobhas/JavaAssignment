package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Tester {

	public static final String DB_Driver="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/election";
	public static final String DB_USER="80458";
	public static final String DB_PASSWORD="80458";
	static {
		try {
			Class.forName(DB_Driver);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Insert New Candidate");
		System.out.println("2.Display All Candidates");
		System.out.println("3.Increment Votes Of Candidates Using Given ID");
		System.out.println("4.Delete Candidate With Given ID");
		System.out.println("5.Find Candidates Of Given ID");
		System.out.println("6.Find Candidates Of Given Party");
		System.out.println("7.Display Total Votes Of Each Party");
		choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		try (Connection con=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){
			while(true)
			{
				choice=menu(sc);
				switch (choice) {
				case 1:
					String sql1="insert into candidates values(default,?,?,?)";
					try(PreparedStatement stmt1=con.prepareStatement(sql1)){
						System.out.println("Enter the Name");
						String name=sc.next();
						System.out.println("Enter the Party");
						String party=sc.next();
						System.out.println("Enter the Votes");
						int votes=sc.nextInt();
						stmt1.setString(1, name);
						stmt1.setString(2, party);
						stmt1.setInt(3, votes);
						int count=stmt1.executeUpdate();
						System.out.println("Rows Affected "+count);
					}
					break;
				case 2:
					String sql2="select * from candidates";
					try(PreparedStatement stmt2=con.prepareStatement(sql2)){
						try(ResultSet rs = stmt2.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
					}
						}
					}
					break;
				case 3:
					String sql3="update candidates set votes=votes+? where id=?";
					try(PreparedStatement stmt3=con.prepareStatement(sql3)){
						System.out.println("Enter the increment votes");
						int num=sc.nextInt();
						System.out.println("Enter the id");
						int id=sc.nextInt();
						stmt3.setInt(1, num);
						stmt3.setInt(2, id);
						int count=stmt3.executeUpdate();
						System.out.println("Rows Affected "+ count);
					}
					break;
				case 4:
					String sql4="delete from candidates where id=?";
					try(PreparedStatement stmt4=con.prepareStatement(sql4)){
						System.out.println("Enter the id");
						int id=sc.nextInt();
						stmt4.setInt(1, id);
						int count=stmt4.executeUpdate();
						System.out.println("Rows Affected "+ count);
					}
						break;				
				case 5:
					String sql5="Select * from candidates where id=?";
					try(PreparedStatement stmt5=con.prepareStatement(sql5)){
						System.out.println("Enter the id");
						int ids=sc.nextInt();
						stmt5.setInt(1, ids);
						try(ResultSet rs = stmt5.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
					}
						
					}
					}
					break;
				case 6:
					String sql6="Select * from candidates where party=?";
					try(PreparedStatement stmt6=con.prepareStatement(sql6)){
						System.out.println("Enter the party");
						String parties=sc.next();
						stmt6.setString(1, parties);
						try(ResultSet rs = stmt6.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
					}
						
					}
					}
					break;
				case 7:						
					String sql7="Select party,sum(votes)vote from candidates group by party";
					try(PreparedStatement stmt6=con.prepareStatement(sql7)){
						try(ResultSet rs = stmt6.executeQuery()) {
							while(rs.next()) {
								String party = rs.getString("party");
								int votes = rs.getInt("vote");
								System.out.println(party+ " ----" +votes);;
					}
						
					}
					}
					break;
				default:
					System.out.println("Wrong Choice Entered");
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
