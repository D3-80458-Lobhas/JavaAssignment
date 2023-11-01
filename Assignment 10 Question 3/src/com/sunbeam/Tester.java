package com.sunbeam;

public class Tester {

	static <T> void printDisplayableBox(Box<? extends Displayable> b)
	{
		b.get().display();
	}
	
	public static <T> void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
		}
	
	public static void main(String[] args) {
		Box <Book> book=new Box<>(new Book("abc",500));
		Box <Person> person=new Box<>(new Person("luffy",20));
		Box <Car> car=new Box<>(new Car("Tesla",50));
		printDisplayableBox(book);
		printDisplayableBox(person);
		printDisplayableBox(car);
		printAnyBox(book);
		printAnyBox(person);
		printAnyBox(car);
	}

}
