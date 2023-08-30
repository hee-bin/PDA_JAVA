package IDCard;

import FrameWork.Factory;
import FrameWork.Product;



public class IDCardFactory extends Factory {
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "\'s card registered");
	}
}
