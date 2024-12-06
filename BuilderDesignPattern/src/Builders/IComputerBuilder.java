package Builders;

import Computers.Computer;

public interface IComputerBuilder {
    ComputerBuilder setCompProcessor(String p);
    ComputerBuilder setCompTouchScreen(boolean val);
    Computer build();
}
