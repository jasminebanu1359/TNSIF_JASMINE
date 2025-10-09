package Tnsif_daysix;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the number : ");
			int number = scanner.nextInt();
			System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
			return;
		} catch (InputMismatchException e) {
			System.err.println("Invalid input...");
		} finally {
			System.out.println("In Finally....");
			scanner.close();
		}
	}

}
