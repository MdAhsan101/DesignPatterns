package Computers;

import Computers.HardDIsk.IHardDIsk;
import Computers.Processors.IProcessor;

public interface IComputerFactory {
    String getBrand();
    IProcessor getProcessor();
    IHardDIsk getHardDisk();
}
