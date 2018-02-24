
public class Banana extends CakeMaker {

	public Banana(Cake newCake) {
		super(newCake);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription() {
		return tempCake.getDescription() + ", Banana";
	};

	public double getCost() {
		return tempCake.getCost() + 1.80;

	};


}
