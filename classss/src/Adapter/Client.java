package Adapter;

public class Client {

	public static void main(String[] args) {
		Print p = new PrintBanner("hello");
		
		p.printWaek();
		p.pirntStrong();
	}

}
