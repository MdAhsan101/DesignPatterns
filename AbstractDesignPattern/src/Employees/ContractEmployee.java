package Employees;

import Computers.DellFactory;
import Computers.IComputerFactory;

public class ContractEmployee implements IEmployee{
    String name;
    private String role;

    public ContractEmployee(String name,String role){
        this.name=name;
        this.role=role;
    }

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public IComputerFactory getComputer() {
        return new DellFactory();
    }

    @Override
    public String toString(){
        return String.format("Type: Contract, Name:%s , Salary:%d , Role:%s , Brand:%s , Processor: %s , HD: %s",
                this.name,this.getSalary(),this.getRole(),this.getComputer().getBrand(),this.getComputer().getProcessor().processorName(),this.getComputer().getHardDisk().HDName()
        );
    }
}
