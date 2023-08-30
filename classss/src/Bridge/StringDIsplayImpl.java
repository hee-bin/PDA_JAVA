package Bridge;

public class StringDIsplayImpl extends DisplayImpl {
	private String string;
	private int width;
	
	public StringDIsplayImpl(String stirng) {
		this.string = stirng;
		this.width = string.length();
		}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for(int i=0; i<width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
