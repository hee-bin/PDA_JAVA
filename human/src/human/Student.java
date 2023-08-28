package human;

public class Student extends Human {
	
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void speak() {
		System.out.println("My name is "+name);
	}
	
	public void lear() {
		System.out.println("I am studying javaaaaaaa");
	}

}
