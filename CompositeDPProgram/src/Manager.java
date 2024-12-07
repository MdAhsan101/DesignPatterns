import java.util.ArrayList;

public class Manager implements IEmployee{
    String name;
    String position;
    ArrayList<IEmployee> subordinators;
    public Manager(String n, String p){
        this.name=n;
        this.position=p;
        this.subordinators= new ArrayList<>();
    }

    public void addSubordinate(IEmployee emp){
        subordinators.add(emp);
    }

    public void removeSubordinate(IEmployee emp){
        subordinators.remove(emp);
    }

    @Override
    public void showDetails() {
        System.out.println("List of subordinates under manger -> "+name+" with role: "+position);
        for (IEmployee emp:subordinators) {
            emp.showDetails();
        }
    }
}
