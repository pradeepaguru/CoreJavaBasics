package com.java.collections;

import java.util.Arrays;
import java.util.Comparator;

public class Compartordemo implements Comparator{



	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		String s1= (String)arg0;
		String s2 = arg1.toString();
		
		if(s1.length()> s2.length()){
			return -1;
		}
		
		else if(s1.length()< s2.length()){
			return 1;
		}
		else
		return 0;
	}
	
	public static String[] names= {"Zee","Sai","Ammu","Dark"};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator comp = new Compartordemo();
		
		Arrays.sort(names,comp);
		
		for(String i:names){
			System.out.println(i);
		}

	}
	
}
