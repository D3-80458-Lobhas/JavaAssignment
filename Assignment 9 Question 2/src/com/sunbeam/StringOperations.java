package com.sunbeam;

public class StringOperations {

	public StringOperations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s1 = "Bank Of Maharashtra";
		String[] s2=s1.split(" ");
		
		StringBuilder s3= new StringBuilder("");
		for(int i=0;i<s2.length;i++)
		{
			s3=s3.append(s2[i].charAt(0));
			
		}
		System.out.println(s3);
		
		String s4 = "this is string";
		String s5[]= s4.split(" ");
		StringBuilder s6=new StringBuilder("");
		for(int i=0;i<s5.length;i++) 
		{	
			Character ch=s5[i].charAt(0);
			ch= Character.toUpperCase(ch);
			s6=s6.append(ch+s5[i].substring(1)+ " ");
		}
		System.out.println(s6);
		
		String s7="Example";
		StringBuilder s8=new StringBuilder();
		for(int i=0;i<s7.length();i++)
		{
			if(i % 2 != 0)
				{
					Character ch=s7.charAt(i);
					ch=ch.toUpperCase(ch);
					s8=s8.append(ch);
				}
			else
				{
					Character ch=s7.charAt(i);
					ch=ch.toLowerCase(ch);
					s8=s8.append(ch);
				
				}
		}
		System.out.println(s8);
		
		//www.sunbeaminfo.com --> www.sunbeaminfo.in
		String s9="www.sunbeaminfo.com";
		String s10=s9.replace("com","in");
		System.out.println(s10);
				
		
		
	}

}


