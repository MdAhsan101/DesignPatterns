package Computers;

public class Computer {
    String brand;
    String processor;
    Boolean isTouchEnabled;
    public Computer(String brand, String processor, Boolean istouch){
        this.brand= brand;
        this.processor= processor;
        this.isTouchEnabled= istouch;
    }

    @Override
    public String toString(){
        return String.format("Brand:%s , Processor:%s , TouchScreen:%b",this.brand,this.processor,this.isTouchEnabled);
    }
}
