abstract class Restaurant {
    public Restaurant() {
        
    }
    
    public Burger orderBurger() {
        return this.createBurger();
    }
    
    public abstract Burger createBurger();
}