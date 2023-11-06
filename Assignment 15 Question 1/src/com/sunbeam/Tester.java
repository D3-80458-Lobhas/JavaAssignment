package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class Tester {
	
	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Insert New Candidate");
		System.out.println("2.Display All Candidates");
		System.out.println("3.Update Details of Candidate");
		System.out.println("4.Find Candidates by Party");
		System.out.println("5.Find Candidate by ID");
		System.out.println("6.Delete Candidate by ID");
		System.out.println("7.Get Total No OF Votes For Each Party");
		
		choice=sc.nextInt();
		return choice;
	}
	

	public static Candidate acceptCandidate(Scanner sc) {
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate( name, party, votes);	
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (CandidateDAO dao = new CandidateDAO())
		{
			while(true)
			{
				int choice=menu(sc);
				switch (choice) {
				case 1:
					Candidate c=acceptCandidate(sc);
					dao.save(c);
					break;
				case 2:
					List<Candidate> list = dao.findAll();
					list.forEach(d -> System.out.println(d));
					break;
				case 3:
					c=acceptCandidate(sc);
					dao.update(c);
					break;
				case 4:
					System.out.println("Enter the Party");
					String party=sc.next();
					List<Candidate> l = dao.findByParty(party);
					l.forEach(d -> System.out.println(d));	
					break;
				case 5:
					System.out.println("Enter the ID");
					int id=sc.nextInt();
					c= dao.findById(id);
					System.out.println(c);
					break;
				case 6:
					System.out.println("Enter the ID");
					int a=sc.nextInt();
					dao.deleteById(a);
					break;
				case 7:
					List<PartyVotes> abc = dao.getPartywiseVotes();
					abc.forEach(d -> System.out.println(d));	
				
				default:
					System.out.println("Wrong ");
					break;
				}
			}

		}catch (Exception e) {	
			e.printStackTrace();
		}
	
	}

}
