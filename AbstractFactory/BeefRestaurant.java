class BeefRestaurant extends Restaurant {
    public BeefRestaurant() {
        
    }
    
    @Override
    public Burger createItalianBurger() {
        return new ItalianBeefBurger();
    }
    
     @Override
    public Burger createAmericanBurger() {
        return new AmericanBeefBurger();
    }
}