package Tnsif_daythree;

class Teacher{
	void teach() {
		System.out.println("Teaching class");
	}
}
class Student extends Teacher{
	void student() {
		System.out.println("Listening class");
	}
}
public class SingleInheritance{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.teach();
		s1.student();
	}

}


