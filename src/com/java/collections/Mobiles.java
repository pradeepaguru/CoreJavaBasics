package com.java.collections;

import java.util.Arrays;
import java.util.Comparator;

public class Mobiles implements Comparator{
	
	public int price;
	public int ram;
	public String names;

public Mobiles(){
	
}


	public Mobiles(String names, int ram, int price) {
		// TODO Auto-generated constructor stub
		this.names = names;
		this.price= price;
		this.ram = ram;
	}


	

	public static void main(String[] args) {
		Mobiles samsung = new Mobiles ("Galaxy", 32,20000);
		Mobiles apple = new Mobiles ("iphone-13", 64,50000);
		Mobiles oppo = new Mobiles ("Vivo", 32,35000);
		
		Mobiles [] mob= {samsung,apple, oppo};
		// TODO Auto-generated method stub
		
		for(Mobiles i : mob ){
			System.out.println("Before" + i.toString());
		}
		
	
		Comparator comp = new Mobiles();
	

	
		Arrays.sort(mob,comp);
		for(Mobiles i : mob ){
			System.out.println("After" + i.toString());
		}
		
		

	}




	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Mobiles m1 = (Mobiles)o1;
		Mobiles m2 = (Mobiles)o2;
		
		if(m1.price < m2.price){
			return 1;
			
		}
		else if(m1.price > m2.price){
			return -1;
			
		}
		else
		
		
		return 0;
	}


	@Override
	public String toString() {
		return "Mobiles [price=" + price + ", ram=" + ram + ", names=" + names + "]";
	}

	
	

}
