package Key;

import FrameWork.Factory;
import FrameWork.Product;

public class Key extends Product{
	private String owner;
	
	public Key(String owner) {
		System.out.println(owner + "\'s key created");
		this.owner = owner;
	}
	

	@Override
	public void use() {
		System.out.println("Use " + owner + "\'s key");
	}
	
	
	public String toString() {
		return owner;
	}
	

}
