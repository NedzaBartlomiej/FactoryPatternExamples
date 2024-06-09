class VeggieRestaurant extends Restaurant {
    public VeggieRestaurant() {
        
    }
    
     @Override
    public Burger createItalianBurger() {
        return new ItalianVeggieBurger(); 
    }
    
     @Override
    public Burger createAmericanBurger() {
        return new AmericanVeggieBurger();
    }
}