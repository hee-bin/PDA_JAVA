package Singleton;

public class main {

	public static void main(String[] args) {
		System.out.println("Start");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("There\'s no difference between obj1 and obj2" );
		}else {
			System.out.println("There\'s difference between obj1 and obj2");
		}
		
		System.out.println("End");

	}

}
