package Template;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractDisplay d1 = new charDIsplay('h');
		AbstractDisplay d2 = new StringDisplay("hello world");
		
		d1.display();
		d2.display();

	}

}
