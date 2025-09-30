package com.tnsif.entityassignment;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setSname("Jasmine");
		s1.setDept("CSE");
		s1.setYear(4);
		s1.setAddress("Panruti");
		System.out.println(s1);
		Student s2=new Student();
		s2.setSname("Roshni");
		s2.setDept("ECE");
		s2.setYear(3);
		s2.setAddress("Villupuram");
		System.out.println(s2);
	}

}
