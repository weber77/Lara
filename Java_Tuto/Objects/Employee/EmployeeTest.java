import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Employee e1 = new Employee("Weber", "Dubois", 15); //creating
        Employee e2 = new Employee("Lara", "Nimer", 15);
        
        ArrayList<Employee> employeeDb = new ArrayList<>();

        employeeDb.add(e1);
        employeeDb.add(e2);


        employeeDb.add(new Employee("Someone", "anotherOne", 2020));
        employeeDb.add(new Employee("Tou", "Kinishi", 200));



        for (int i = 0; i < employeeDb.size(); i++) {
            System.out.println("Employee " + i + " has the following properties: ");
            
            System.out.println(employeeDb.get(i));//get
            System.out.println("----------------------------\n");
            
        }

        System.out.println("Which employee will you like to promote");
        int em = s.nextInt();

        employeeDb.remove(em);

        for (int i = 0; i < employeeDb.size(); i++) {
            System.out.println("Employee " + i + " has the following properties: ");
            
            System.out.println(employeeDb.get(i));//get
            System.out.println("----------------------------\n");
            
        }

       /*  System.out.println("First employee's name is " + e1.getFirstName() + " " +e1.getLastName());
        System.out.println("Second employee's name is " + e2.getFirstName() + " " +e2.getLastName());


        System.out.println("Enter first employee's new first name: ");
        String newF = s.nextLine();

        e1.setFirstName(newF); // modified

        System.out.println("First employee's name is " + e1.getFirstName() + " " +e1.getLastName());

        System.out.println("----------------------------");
        System.out.println(e1);//get

        e1.setSalary(5000.25);

        System.out.println("----------------------------");
        System.out.println(e1);//get */
    }
}
