package FIbonacci;

public abstract class Strategy {
	private String name;
	private int n;
	
	public Strategy(String name, int n) {
		super();
		this.name = name;
		this.n =n;
	}
	abstract void perform(); 
}
