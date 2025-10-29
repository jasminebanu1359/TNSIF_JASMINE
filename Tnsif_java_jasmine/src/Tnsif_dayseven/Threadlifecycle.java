package Tnsif_dayseven;

public class Threadlifecycle {

	public static void main(String[] args) {
		Mychildthread myThread = new Mychildthread();
		System.out.println("Before Runnable stage Thread is alive or not? " + myThread.isAlive());
		myThread.start();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException exp) {
			System.err.println("Thread is interrupted !");
		}

		System.out.println("After complete execution of Thread ,it is alive or not? " + myThread.isAlive());
	}
}
