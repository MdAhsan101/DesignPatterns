import Builders.ComputerBuilder;
import Computers.Computer;

public class BuilderDPExample {
    public static void main(String[] args) {
        ComputerBuilder cb= new ComputerBuilder("Dell");
        Computer dellComp= cb.setCompProcessor("I5").setCompTouchScreen(false).build();
        System.out.println("Dell Laptop: "+dellComp);

        cb= new ComputerBuilder("Apple");
        Computer macBook= cb.setCompProcessor("I7").setCompTouchScreen(true).build();
        System.out.println("MacBook: "+macBook);
    }
}