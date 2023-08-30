package Key;

import FrameWork.Factory;
import FrameWork.Product;


public class KeyFactory extends Factory{

	@Override
	protected Product createProduct(String owner) {
		return new Key(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product  + "\'s key could be used");
	}
	
}
