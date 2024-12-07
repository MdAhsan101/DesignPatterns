//Decorator
public abstract class CoffeeDecorator implements ICoffee{
    ICoffee coffee;
    CoffeeDecorator(ICoffee coffee){
        this.coffee= coffee;
    }

    @Override
    public String getDescription(){
        return this.coffee.getDescription();
    }

    @Override
    public int getCost() {
        return this.coffee.getCost();
    }
}
