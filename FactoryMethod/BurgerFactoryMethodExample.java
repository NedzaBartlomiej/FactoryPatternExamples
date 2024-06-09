public class BurgerFactoryMethodExample
{
	public static void main(String[] args) {
	    Restaurant beefRestaurant = new BeefRestaurant();
	    Restaurant veggieRestaurant = new VeggieRestaurant();
	    
	    Burger beefBurger = beefRestaurant.orderBurger();
	    Burger veggieBurger = veggieRestaurant.orderBurger();
	    
	    beefBurger.writeInfo();
	    veggieBurger.writeInfo();
	}
}
