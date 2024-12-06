package Employees;

import Computers.IComputerFactory;

public interface IEmployee {
    int getSalary();
    String getRole();

    IComputerFactory getComputer();
}
