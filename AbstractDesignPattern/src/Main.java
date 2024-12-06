import Employees.ContractEmployee;
import Employees.IEmployee;
import Employees.PermanentEmployee;

public class Main {
    public static void main(String[] args) {
        IEmployee pEmp= new PermanentEmployee("Ahsan","Developer");
        IEmployee cEmp= new ContractEmployee("Allen","Manager");
        System.out.println("Permanent Employee: "+pEmp);
        System.out.println("Contract Employee: "+cEmp);
    }
}