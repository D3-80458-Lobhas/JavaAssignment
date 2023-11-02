package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {


	public static void main(String[] args) {

		List<String> list= new ArrayList<String>();
		Collections.addAll(list, "abc","abcds","Lobhas Nikumbh","Roronoa Zoro");
		System.out.println(list);
		System.out.println(Collections.max(list,new StringLengthComparator()));
	}

}
