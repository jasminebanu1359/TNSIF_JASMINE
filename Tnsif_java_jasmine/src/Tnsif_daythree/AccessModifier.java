package Tnsif_daythree;

public class AccessModifier {
	public int publicVar=20;
	private String privateVar="Jasmine";
	protected char protectVar='A';
	int defaultVar=10;
	public void modifier() {
		System.out.println("Public variable:"+ publicVar);
		System.out.println("Private variable:"+ privateVar);
		System.out.println("Protected variable:"+ protectVar);
		System.out.println("Default variable:"+ defaultVar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier acc=new AccessModifier();
		acc.modifier();
	}

}
