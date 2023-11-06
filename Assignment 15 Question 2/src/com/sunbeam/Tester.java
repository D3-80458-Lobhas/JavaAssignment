package com.sunbeam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Tester {
	
	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Insert New User");
		System.out.println("2.Display All User");
		System.out.println("3.Update Details of User");
		System.out.println("4.Delete User by ID");		
		choice=sc.nextInt();
		return choice;
	}
	

	public static User acceptUser(Scanner sc) throws Exception{
		System.out.print("Enter First Name: ");
		String fname = sc.next();
		System.out.print("Enter Last Name: ");
		String lname = sc.next();
		System.out.print("Enter Email: ");
		String email = sc.next();
		System.out.print("Enter Password: ");
		String password = sc.next();
		System.out.println("Enter the DOB");
		String dateStr=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate=sdf.parse(dateStr);
		java.sql.Date sDate= new java.sql.Date(uDate.getTime());
		User u = new User(fname,lname,email,password,sDate);	
		return u;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (UserDAO dao = new UserDAO())
		{
			while(true)
			{
				int choice=menu(sc);
				switch (choice) {
				case 1:
					User c=acceptUser(sc);
					dao.save(c);
					break;
				case 2:
					List<User> list = dao.findAll();
					list.forEach(d -> System.out.println(d));
					break;
				case 3:
					c=acceptUser(sc);
					dao.update(c);
					break;
				case 4:
					System.out.println("Enter the ID");
					int a=sc.nextInt();
					dao.deleteById(a);
					break;
				default:
					System.out.println("Wrong Choice ");
					break;
				}
			}

		}catch (Exception e) {	
			e.printStackTrace();
		}
	
	}

}
