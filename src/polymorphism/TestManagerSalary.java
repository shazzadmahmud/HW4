package polymorphism;

public class TestManagerSalary {
	 
    public static void main(String[] args) {
         ManagerSalary mas = new ManagerSalary();
        System.out.println(mas.weekly(800, 300));
        System.out.println(mas.monthly(800, 300, 200));
        System.out.println(mas.yearly(13000, 12000, 11000, 23000));
         
        AccrateSalary acs = new AccrateSalary();
       System.out.println(acs.yearly(11000, 18000, 10000, 30000));
         
 
    }
 
}
