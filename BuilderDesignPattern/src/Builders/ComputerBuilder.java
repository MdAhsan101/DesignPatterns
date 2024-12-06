package Builders;

import Computers.Computer;

public class ComputerBuilder implements IComputerBuilder{
    String brand="";
    String processor="";
    Boolean isTouchEnabled=false;

    public ComputerBuilder(String brand){
        this.brand= brand;
    }

    @Override
    public ComputerBuilder setCompProcessor(String p){
        this.processor= p;
        return this;
    }

    @Override
    public ComputerBuilder setCompTouchScreen(boolean val){
        this.isTouchEnabled= val;
        return this;
    }

    @Override
    public Computer build(){
        return new Computer(this.brand,this.processor,this.isTouchEnabled);
    }
}






