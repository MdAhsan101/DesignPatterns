public class CDPApp {
    public static void main(String[] args) {
        Manager teamLead= new Manager("Allen","Team Lead");
        IEmployee developer1= new SubOrdinates("Shiva","Developer L1");
        IEmployee developer2= new SubOrdinates("Rajat","Developer L1");
        teamLead.addSubordinate(developer1);
        teamLead.addSubordinate(developer2);

        Manager manager= new Manager("Kiran","Engineering Manager");
        IEmployee designer= new SubOrdinates("Neha","Designer");
        manager.addSubordinate(designer);
        manager.addSubordinate(teamLead);
        manager.showDetails();

        /*
        List of subordinates under manger -> Kiran with role: Engineering Manager
        Subordinate Name: Neha ,Role: Designer
        List of subordinates under manger -> Allen with role: Team Lead
        Subordinate Name: Shiva ,Role: Developer L1
        Subordinate Name: Rajat ,Role: Developer L1
         */
    }
}