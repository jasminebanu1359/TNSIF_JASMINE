package com.tnsif.entity.java;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(); //Constructor call
		c1.setId(101);
		c1.setName("Raja");
		c1.setCity("Villupuram");
		System.out.println(c1);
		Customer c2=new Customer();
		c2.setId(102);
		c2.setName("Jas");
		c2.setCity("Panruti");
		System.out.println(c2);
	}

}
