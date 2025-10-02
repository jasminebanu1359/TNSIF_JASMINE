package Tnsif_daythree;

final class Final {
	final int value=15;
	public void FinalDemo() {
		System.out.println("The value is : "+value);
		int value=5;
		System.out.println("The value after final : "+value);
	}

	public static void main(String[] args) {
		Final f=new Final();
		f.FinalDemo();

	}

}
