public class BurgerFactoryExample
{
	public static void main(String[] args) {
	    Restaurant restaurant = new Restaurant();
	    
		Burger beefBurger = restaurant.orderBurger("Beef");
		beefBurger.writeInfo();
		
		Burger veggieBurger = restaurant.orderBurger("Veggie");
		veggieBurger.writeInfo();
	}
}