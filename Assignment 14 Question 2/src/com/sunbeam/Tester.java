package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
		System.out.println("1.Insert New User");
		System.out.println("2.Display All Users");
		System.out.println("3.Delete Voter With Given ID");
		System.out.println("4.Change Status of Voter With Given ID to True");
		System.out.println("5.Change The Name And Birth Date of Voter");
		choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args ){
		Scanner sc=new Scanner(System.in);
		
		int choice;
		try (Connection con=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){
			while(true)
			{
				choice=menu(sc);
				switch (choice) {
				case 1:
					String sql1="insert into users values(default,?,?,?,?,?,0,'voter')";
					try(PreparedStatement stmt1=con.prepareStatement(sql1)){
						System.out.println("Enter the First Name");
						String firstName=sc.next();
						System.out.println("Enter the Last Name");
						String lastName=sc.next();
						System.out.println("Enter the Email");
						String email=sc.next();
						System.out.println("Enter the Password");
						String password=sc.next();
						System.out.println("Enter the DOB");
						String dateStr=sc.next();
						SimpleDateFormat sdf;
						sdf=new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate=sdf.parse(dateStr);
						java.sql.Date sDate;
						sDate= new java.sql.Date(uDate.getTime());
						stmt1.setString(1, firstName);
						stmt1.setString(2, lastName);
						stmt1.setString(3, email);
						stmt1.setString(4, password);
						stmt1.setDate(5,sDate);
						int count=stmt1.executeUpdate();
						System.out.println("Rows Affected "+count);
					}
					break;
				case 2:
					String sql2="select * from users";
					try(PreparedStatement stmt2=con.prepareStatement(sql2)){
						try(ResultSet rs = stmt2.executeQuery()) {
							while(rs.next()) {
								java.sql.Date sDate=rs.getDate("dob");
								SimpleDateFormat sdf;
								sdf=new SimpleDateFormat("dd-MM-yyyy");
								String dateStr=sdf.format(sDate);
								int id = rs.getInt("id");
								String firstName=rs.getString("first_name");
								String lastName=rs.getString("last_name");
								String email=rs.getString("email");
								String password=rs.getString("password");
								int Status=rs.getInt("status");
								String role=rs.getString("role");
								System.out.println(id+" "+firstName+" "+lastName+" "+email+" "+password+" "+dateStr+" "+Status+" "+role);
					}
					}
					}
					break;
				case 3:
					String sql3="delete from users where id=?";
					try(PreparedStatement stmt3=con.prepareStatement(sql3)){
					System.out.println("Enter the id");
					int id=sc.nextInt();
					stmt3.setInt(1, id);
					int count=stmt3.executeUpdate();
					System.out.println("Rows Affected "+ count);
				}
					break;				
				case 4:
					String sql4="update users set status=1 where id=?";
					try(PreparedStatement stmt4=con.prepareStatement(sql4)){
					System.out.println("Enter the id");
					int id=sc.nextInt();
					stmt4.setInt(1, id);
					int count=stmt4.executeUpdate();
					System.out.println("Rows Affected "+ count);
				}
					break;	
				case 5:
					String sql5="update users set first_name=?,last_name=?,dob=? where id=?";
					try(PreparedStatement stmt5=con.prepareStatement(sql5)){
						System.out.println("Enter the ID");
						int id=sc.nextInt();
						System.out.println("Enter the First Name");
						String firstName=sc.next();
						System.out.println("Enter the Last Name");
						String lastName=sc.next();
						System.out.println("Enter the DOB");
						String dateStr=sc.next();
						SimpleDateFormat sdf;
						sdf=new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate=sdf.parse(dateStr);
						java.sql.Date sDate;
						sDate= new java.sql.Date(uDate.getTime());
						stmt5.setString(1, firstName);
						stmt5.setString(2, lastName);
						stmt5.setDate(3,sDate);
						stmt5.setInt(4,id);
						int count=stmt5.executeUpdate();
						System.out.println("Rows Affected "+ count);
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
