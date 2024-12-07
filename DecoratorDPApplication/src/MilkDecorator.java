// Concrete Decorator
public class MilkDecorator extends CoffeeDecorator {

    MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return this.coffee.getDescription()+", Milk";
    }

    @Override
    public int getCost() {
        return this.coffee.getCost()+2;
    }
}
