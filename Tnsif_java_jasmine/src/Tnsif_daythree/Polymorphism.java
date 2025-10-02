package Tnsif_daythree;

public class Polymorphism{
	void add(int a,int b) {
		int c=a+b;
		System.out.println("The addition of a= "+a+" and b= "+b+" is "+c);
	}
	void add(double a,double b) {
		double c=a+b;
		System.out.println("The addition of a= "+a+" and b= "+b+" is "+c);
	}

	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.add(10, 10);
		p.add(1.0, 2.0);

	}

}
