public class SubOrdinates implements IEmployee{
    String name;
    String position;
    public SubOrdinates(String n, String p){
        this.name=n;
        this.position=p;
    }
    @Override
    public void showDetails() {
        System.out.println("Subordinate Name: " + name + " ,Role: " + position);
    }
}
