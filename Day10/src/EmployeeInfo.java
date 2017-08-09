import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by badkass on 7/29/2017.
 */
/*

1) Create a class called Employee and create atleast 50 employees.
        Then only filter those who are getting more then 50000.00 and
        then calculate there tds as 10% and show the total of tds.

        Plus meet below requirements also :
        a) Average of all employee salaries per month
        b) Total salary paid to all per month
        c) Who is getting minimum salary
        d) Who is getting maximum salary
        e) How many employees are there in the company
*/

public class EmployeeInfo {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        createEmployee(empList);
        Stream<Double> stream1 = empList.stream().filter((emp) -> emp.getSalary()>50000).map((emp) -> emp.getSalary()*0.01);
        double avgSal = (empList.stream().map((val) -> val.getSalary()).reduce((a,b) -> a+b).get())/empList.size();
        double totSal = empList.stream().map((val) -> val.getSalary()).reduce((a,b) -> a+b).get();
        System.out.println("Total salary : " + totSal);
        System.out.println("Average salary of all employees : " + avgSal);
        String name = (empList.stream().min((a,b) -> Double.compare(a.getSalary(),b.getSalary())).get()).getName();
        System.out.println("Person with Minimum salary : " + name);
        name = (empList.stream().max((a,b) -> Double.compare(a.getSalary(),b.getSalary())).get()).getName();
        System.out.println("Person with maximun salary : " + name);
        System.out.println(empList.stream().count());

    }

    private static void createEmployee(List<Employee> empList) {
        Employee e1 = new Employee(46, "Ramesh", 234258.00, "Mumbai");
        Employee e2 = new Employee(453, "Suresh", 400005.00, "Pune");
        Employee e3 = new Employee(76, "Ram", 435234.00, "Goa");
        Employee e4 = new Employee(547, "Naresh", 351543.00, "Chandigarh");
        Employee e5 = new Employee(76568, "Ricky", 128442.00, "Rajasthan");
        Employee e6 = new Employee(655, "Micky", 2348655.00, "Canada");
        Employee e7 = new Employee(467, "Joe", 2455643.00, "Kerla");
        Employee e8 = new Employee(236, "Doe", 342684.00, "Andhra");
        Employee e9 = new Employee(5567, "Joey", 13234.00, "Pune");
        Employee e10 = new Employee(134, "Chandler", 3464664.00, "Mumbai");
        Employee e11 = new Employee(805, "Monica", 2344835.00, "Mumbai");
        Employee e12 = new Employee(546, "Rachel", 2356684.00, "Mumbai");
        Employee e13 = new Employee(5463, "Phoebe", 2345664.00, "Mumbai");


        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);
        empList.add(e10);
        empList.add(e11);
        empList.add(e12);
        empList.add(e13);
    }

}
