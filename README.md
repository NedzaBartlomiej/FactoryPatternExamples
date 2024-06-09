
# Factory Idiom

This is a basic implementation of factory pattern with loose structure:
- Parametrized configuration for `factory method`,
- This pattern just only provides a separation of object creation logic from business logic by exlude `if statements` from business logic.

# Factory Method

More advanced implementation, that:
- Remove not elegant `if statements`,
- Provide a more concise structure for creating objects,
- Creates an object by delegating to methods of classes extending the factory,
- Focuses on one `production method`

### Example explanation:

#### Factory Method `(Restaurant.createBurger())`:
The `createBurger` method is declared abstract in the `Restaurant` class and is implemented in the `(BeefRestaurant and VeggieRestaurant)` subclasses.

#### Concrete Products `(BeefBurger, VeggieBurger)`:
The concrete products are the classes `BeefBurger` and `VeggieBurger`, which inherit from the abstract class `Burger`.

#### Concrete Creators `(BeefRestaurant, VeggieRestaurant)`:
Subclasses of `Restaurant` that implement the createBurger factory method and return the appropriate specific products.

# Abstract Factory

It Extends Factory Method on possibility of provide many `factory methods` for various, but related objects.

### Example explanation:

#### Abstract Factory `(Restaurant)`
Defines methods for creating abstract products (in this case, burgers). In code, these are the methods `createItalianBurger()` and `createAmericanBurger()`.

#### Concrete Factory `(BeefRestaurant, VeggieRestaurant)`
Implement the Abstract Factory interface, creating concrete products. In code, `BeefRestaurant` creates beef burgers, while `VeggieRestaurant` creates veggie burgers.

#### Abstract Product `(Burger)`
Defines the interface for products to be created by the factory. In code, this is the `Burger` class.

#### Concrete Product `(ItalianBeefBurger, AmericanBeefBurger, ItalianVeggieBurger, AmericanVeggieBurger)`
Implement the Abstract Product interface, defining concrete products.
