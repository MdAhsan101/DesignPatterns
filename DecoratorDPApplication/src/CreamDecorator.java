// Concrete Decorator
public class CreamDecorator extends CoffeeDecorator {

    CreamDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return this.coffee.getDescription()+", Cream";
    }

    @Override
    public int getCost() {
        return this.coffee.getCost()+3;
    }
}
