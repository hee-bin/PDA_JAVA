package Proxy;

public class PrintProxy implements Printable {
	private String name;
	private Printer real;
	
	public PrintProxy() {
		this.name = "no name";
		this.real = null;
	}
	
	public PrintProxy(String name) {
		this.name = name;
		this.real = null;
	}

	@Override
	public synchronized  void setPrinterName(String name) {
		if(real != null) {
			//'본인' 에게도 설정한다.
			System.out.println("real is not null");
			System.out.println("this is real : " + real);
			real.setPrinterName(name);
		}else 	{
			System.out.println("real is null");
			System.out.println("this is real : " + real);
			this.name = name;
		}
	}

	@Override
	public void getPrinterName() {
		System.out.println("The current name is  \"" + this.name + "\"");
	}

	@Override
	public void print(String string) {
			realize();
			real.print(string);
	}
	
	 // 본인 생성
	private synchronized void realize() {
		if( real == null) {
			getPrinterName();
			real = new Printer(name);
		}
	}
	

}
