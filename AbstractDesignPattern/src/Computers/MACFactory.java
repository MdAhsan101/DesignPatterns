package Computers;

import Computers.HardDIsk.HitachiHD;
import Computers.HardDIsk.IHardDIsk;
import Computers.HardDIsk.SamsungHD;
import Computers.Processors.I5;
import Computers.Processors.I7;
import Computers.Processors.IProcessor;
import Enum.Brands;

public class MACFactory implements  IComputerFactory{
    @Override
    public String getBrand() {
        return Brands.MAC.toString();
    }

    @Override
    public IProcessor getProcessor() {
        return new I7();
    }

    @Override
    public IHardDIsk getHardDisk() {
        return new SamsungHD();
    }
}
