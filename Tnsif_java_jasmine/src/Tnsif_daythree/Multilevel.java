package Tnsif_daythree;
class Animal{
	void animal() {
		System.out.println("Animals");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
class Cat extends Dog{
	void meow() {
		System.out.println("Meowing");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.meow();
		c.bark();
		c.animal();

	}

}
