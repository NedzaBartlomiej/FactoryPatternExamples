class BeefRestaurant extends Restaurant {
    public BeefRestaurant() {
        
    }
    
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}