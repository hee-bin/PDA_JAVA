package Adapter;

public class PrintBanner extends Print {
	private Banner banner;
	
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	

	@Override
	public void printWaek() {
		banner.showWithParen();
		
	}

	@Override
	public void pirntStrong() {
		banner.showWithAster();
		
	}
	
	

}
