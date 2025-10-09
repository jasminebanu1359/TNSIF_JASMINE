package Tnsif_dayfour;
import java.util.Scanner;

public class Scannerexample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter College Name: ");
		String cname = sc.nextLine();
		
		
		System.out.println("Enter Couselling Code: ");
		int code = sc.nextInt();
		
		System.out.println("The College name is: " + cname +", The College code is: "+code);

	}

}
