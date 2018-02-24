
public class IceCream extends CakeMaker {

	public IceCream(Cake newCake) {
		super(newCake);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription() {
		return tempCake.getDescription() + ", Ice Cream";
	};

	public double getCost() {
		return tempCake.getCost() + 1.45;

	};

}
