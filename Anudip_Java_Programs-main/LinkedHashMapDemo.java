package com.java;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
		lm.put(1, "Tejas");
		lm.put(14, "Omkar");
		lm.put(6, "Krushna");
		lm.put(7, null);
		lm.put(3, "Sukesh");
		lm.put(8, null);
		lm.put(null, null);
	//	lm.put(null, null);		//only one null pair is allowed
		lm.put(11, "Sukesh");	//no duplicate keys are allowed

		
		System.out.println(lm);
		
		
		

	}

}
