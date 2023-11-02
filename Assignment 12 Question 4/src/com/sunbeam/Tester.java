package com.sunbeam;

import java.util.PriorityQueue;
import java.util.Queue;

public class Tester {

	public static void main(String[] args) {
		Queue<Employee> q=new PriorityQueue<Employee>(new SalaryDescComparator());
		q.offer(new Employee(5,"abcd",5550.5));
		q.offer(new Employee(6,"Roronoa",4555));
		q.offer(new Employee(7,"zoro",7555));
		q.offer(new Employee(8,"qwerty",8555));
		q.offer(new Employee(9,"luffy",10555));
		System.out.println(q);
		
		while(!q.isEmpty()) {
			Employee ele = q.poll();
			System.out.println("Popped: " + ele);
		
	}

}
}