
public class Cream extends CakeMaker {

	public Cream(Cake newCake) {
		super(newCake);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription() {
		return tempCake.getDescription() + ", Cream";
	};

	public double getCost() {
		return tempCake.getCost() + 1.00;

	};

}
