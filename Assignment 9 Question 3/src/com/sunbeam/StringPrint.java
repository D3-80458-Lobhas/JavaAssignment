package com.sunbeam;

public class StringPrint {

	public StringPrint() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//String s="Type String StringBuffer and StringBuilder code snippets from the notes above";
		//String s1[]=s.split(" ");
		String s2[]= {"Type","The","String","Buffer","Mango","aeiou"};
		StringBuilder s3=new StringBuilder(" ");
		Character ch;
		for(int i=0;i<s2.length;i++)
		{
			ch=s2[i].charAt(s2[i].length()-1);
			if(ch=='a' | ch=='e' | ch=='i'|ch=='o'|ch=='u')
			{
				s3=s3.append(s2[i] + " ");
			}
		}
		System.out.println(s3);
	}

}
