package com.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		
		System.out.println(list2.size());
		
		list2.add("Four");
		list2.add("Five");
		
		System.out.println(list2.size());

		list2.remove("Two");
		
		System.out.println(list2.size());
		
		list2.add(1,"Two");	//index 1
		
		System.out.println(list2.get(3));
		
	
		

	}

}
