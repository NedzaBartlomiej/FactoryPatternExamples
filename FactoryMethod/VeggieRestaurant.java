class VeggieRestaurant extends Restaurant {
    public VeggieRestaurant() {
        
    }
    
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
