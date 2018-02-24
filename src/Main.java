
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cake cake1 = new Banana(new IceCream(new Cream(new VanillaCake())));
		
		System.out.println("Ingredients: " + cake1.getDescription());
		System.out.println("Total cost: $" + cake1.getCost());
		
		Cake cake2 = new Cream(new Banana(new PlainCake()));
		
		System.out.println("Ingredients: " + cake2.getDescription());
		System.out.println("Total cost: $" + cake2.getCost());
	}

}
