package Factory.food;

public class Factory {

	public static void main(String[] args) {
		FactoryFood f = new FactoryFood();
		Food o = f.getFood("pizza");
		o.spec();

	}

}
