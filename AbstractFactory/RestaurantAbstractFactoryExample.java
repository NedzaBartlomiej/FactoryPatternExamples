public class RestaurantAbstractFactoryExample
{
	public static void main(String[] args) {
	    Restaurant beefRestaurant = new BeefRestaurant();
	    Restaurant veggieRestaurant = new VeggieRestaurant();
	    
	    Burger italianBeefBurger = beefRestaurant.orderItalianBurger();
	    Burger italianVeggieBurger = veggieRestaurant.orderItalianBurger();
	    
	    Burger americanBeefBurger = beefRestaurant.orderAmericanBurger();
	    Burger americanVeggieBurger = veggieRestaurant.orderAmericanBurger();
	    
	    italianBeefBurger.writeInfo();
	    italianVeggieBurger.writeInfo();
	    
	    americanBeefBurger.writeInfo();
	    americanVeggieBurger.writeInfo();
	}
}