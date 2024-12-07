public class DecoratorApp {
    public static void main(String[] args) {
        ICoffee coffee= new SimpleCoffee();
        System.out.println(coffee.getDescription()+" => Rs "+coffee.getCost());
        coffee= new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+" => Rs "+coffee.getCost());
        coffee= new CreamDecorator(coffee);
        System.out.println(coffee.getDescription()+" => Rs "+coffee.getCost());
    }
}