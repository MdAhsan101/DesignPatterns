package Computers;
import Computers.HardDIsk.HitachiHD;
import Computers.Processors.I5;
import Computers.HardDIsk.IHardDIsk;
import Computers.Processors.IProcessor;
import Enum.Brands;
public class DellFactory implements IComputerFactory{
    @Override
    public String getBrand() {
        return Brands.DELL.toString();
    }

    @Override
    public IProcessor getProcessor() {
        return new I5();
    }

    @Override
    public IHardDIsk getHardDisk() {
        return new HitachiHD();
    }
}
