package com.tnsif.entityassignment;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.setPid(101);
		p1.setPname("Television");
		p1.setQuantity(5);
		System.out.println(p1);
		Product p2=new Product();
		p2.setPid(102);
		p2.setPname("Washing Machine");
		p2.setQuantity(3);
		System.out.println(p2);
	}

}
