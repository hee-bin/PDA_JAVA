package IDCard;

import FrameWork.Factory;
import FrameWork.Product;

public class IDCard extends Product {
	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner + "\'s card created" );
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("Use " + owner + "\'s card");
	}
	
	
	@Override
	public String toString() {
		//return "[IDCard :" + owner +  "]";
		return getOwner();
	}
	
	public String getOwner() {
		return owner;
	}

}
