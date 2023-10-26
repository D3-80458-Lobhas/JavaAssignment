package com.sunbeam;

public class Person implements Cloneable {
	private String name;
	private int age;
	private Date birthDate;
	
	/**
	 * @param name
	 * @param age
	 * @param birthDate
	 */
	public Person(String name, int age,int day, int month, int year) {
		this.name = name;
		this.age = age;
		this.birthDate=new Date(day,month,year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Person() {
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthDate=" + birthDate ;
	}

	public Object clone() throws CloneNotSupportedException
	{
		Person temp=(Person)super.clone();
		temp.birthDate=	(Date)this.birthDate.clone();
		return temp;
	}
	
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Person p1=new Person("abc",10,5,6,1999);
		Person p2= (Person) p1.clone();
		System.out.println(p1);
		p2.getBirthDate().setMonth(4);
		System.out.println(p1);
		System.out.println(p2);
	}
}
