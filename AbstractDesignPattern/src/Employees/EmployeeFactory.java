package Employees;

public class EmployeeFactory {
    String empType="";
    String name;
    String role;
    EmployeeFactory(String name,String role,String empType){
        this.empType=empType;
        this.name=name;
        this.role=role;
    }

    public IEmployee getEmployee(){
        IEmployee returnVal= null;
        if(empType.equalsIgnoreCase("Permanent")){
            returnVal= new PermanentEmployee(name,role);
        } else if (empType.equalsIgnoreCase("Contract")) {
            returnVal= new ContractEmployee(name,role);
        }
        return returnVal;
    }
}
