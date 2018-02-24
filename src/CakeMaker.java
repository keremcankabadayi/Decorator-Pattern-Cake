
public abstract class CakeMaker implements Cake {

	protected Cake tempCake;

	public CakeMaker(Cake newCake) {
		// TODO Auto-generated constructor stub
		this.tempCake = newCake;
	}

	public String getDescription() {
		return tempCake.getDescription();
	};

	public double getCost() {
		return tempCake.getCost();

	};

}
