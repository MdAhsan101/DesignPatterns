// Concrete Component
public class SimpleCoffee implements ICoffee{

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
