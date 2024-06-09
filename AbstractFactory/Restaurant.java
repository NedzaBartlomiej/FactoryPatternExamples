abstract class Restaurant {
    public Restaurant() {
        
    }
    
    public Burger orderItalianBurger() {
        return this.createItalianBurger();
    }
    
    public Burger orderAmericanBurger() {
        return this.createAmericanBurger();
    }
    
    public abstract Burger createItalianBurger();
    
    public abstract Burger createAmericanBurger();
}