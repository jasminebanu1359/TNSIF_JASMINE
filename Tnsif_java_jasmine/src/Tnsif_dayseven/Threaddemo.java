package Tnsif_dayseven;


public class Threaddemo {
	public static void main(String[] args) {
		Childthread threadOne = new Childthread(5, "First");
		Childthread threadTwo = new Childthread(10, "Second");

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException
		// threadOne.run(); // single threaded application 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}

