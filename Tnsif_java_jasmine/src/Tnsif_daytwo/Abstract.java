package Tnsif_daytwo;
abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is meowing");
    }
}
class Goat extends Animal {
	void sound() {
		System.out.println("Goat is eating");
	}
}

public class Abstract {
    public static void main(String[] args) {
        Animal a1 = new Dog(); 
        Animal a2 = new Cat(); 
        Animal a3 = new Goat();
        a1.sound();
        a2.sound();
        a3.sound();
    }
}


