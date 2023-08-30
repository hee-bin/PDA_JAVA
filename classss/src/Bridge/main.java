package Bridge;

public class main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDIsplayImpl("This is Display1"));
		Display d2 = new Display(new StringDIsplayImpl("This is Display2"));
		
		CountDisplay d3 = new CountDisplay(new StringDIsplayImpl("This is CountDisplay"));
		StringDIsplayImpl d4 = new StringDIsplayImpl("This is StringDisplayImpl");
		
		
		d1.display();
		d2.display();
	
		
		d3.display();
		d3.multiDisplay(5);
		
		
		d4.rawClose();
		d4.rawPrint();
		d4.rawClose();
	}

}
