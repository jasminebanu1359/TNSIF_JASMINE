package Tnsif_dayseven;

public class Usingrunnable implements Runnable {
	Thread thread;
	int high, low;
	String msg;

	public Usingrunnable(int low, int high, String msg) {
		this.high = high;
		this.low = low;
		this.msg = msg;
		thread = new Thread(this, "Child Thread");
		thread.start();
	}

	@Override
	public void run() {
		for (int i = low; i <= high; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
}
