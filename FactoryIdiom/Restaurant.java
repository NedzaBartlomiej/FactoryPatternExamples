class Restaurant {
    public Restaurant() {
        
    }
    
    public Burger orderBurger(String type) {
        BurgerFactory bf = new BurgerFactory();
        return bf.createBurger(type);
    }
}