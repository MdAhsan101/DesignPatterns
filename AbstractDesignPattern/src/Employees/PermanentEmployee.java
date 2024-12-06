package Employees;

import Computers.IComputerFactory;
import Computers.MACFactory;

public class PermanentEmployee implements IEmployee{
    String name;
    private String role;

    public PermanentEmployee(String name,String role){
        this.name=name;
        this.role=role;
    }

    @Override
    public int getSalary() {
        return 100000;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public IComputerFactory getComputer() {
        return new MACFactory();
    }

    @Override
    public String toString(){
        return String.format("Type: Permanent, Name:%s , Salary:%d , Role:%s , Brand:%s , Processor: %s , HD: %s",
                this.name,this.getSalary(),this.getRole(),this.getComputer().getBrand(),this.getComputer().getProcessor().processorName(),this.getComputer().getHardDisk().HDName()
                );
    }

}
