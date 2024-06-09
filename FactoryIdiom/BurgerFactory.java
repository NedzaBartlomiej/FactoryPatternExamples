class BurgerFactory {
    public BurgerFactory() {
        
    }
    
    public Burger createBurger(String type) {
        if (type == "Beef") {
            return new BeefBurger();
        }
        if (type == "Veggie") {
            return new VeggieBurger();
        }
        return null;
    }
}