import org.junit.Test;

import java.util.*;

/**
 * Created by badkass on 7/18/2017.
 */
public class EmployeeTest {
    List<Employee> employeeList = new ArrayList<>();


    public static List<Employee> createTestData() {
        Employee e1 = new Employee(101,45, "Bob", "Maze", "1996/6/23", new Date(2025-1900,7-1,4), "Research", location.HYD);
        Employee e2 = new Employee(104, 23, "Susan", "Doe","1995/4/21", new Date(2017-1900,6-1,6), "Business Intelligence", location.PUN);
        Employee e3 = new Employee(105,33, "Joe", "Ferry","1991/9/14", new Date(2016-1900,2-1,29), "Research", location.HYD);
        Employee e4 = new Employee(102, 29, "Maria", "Samuel", "1990/3/14",new Date(2016-1900,11-1,12), "Marketing", location.PUN);
        Employee e5 = new Employee(103,28,"Sam", "Dazy", "1994/6/23", new Date(2010-1900,12-1,23), "Finance", location.PUN);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        return empList;
    }

    class IDExtractor implements Extractor {
        public int extractInt(Employee e) {
            return e.getEmpID();
        }
    }

    public static void main(String[] args) {


       /* for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

//        System.out.println("Sort by employee ID");
//        Employee[] emplist = MyUtil.sort(employeeList.toArray(new Employee[]{}),new CompareID());
//        for (Employee emp : emplist)
//            System.out.println(emp);

        System.out.println("Sort by employee Department");
        Employee[] emplist1 = MyUtil.sort(employeeList.toArray(new Employee[]{}), new CompareName());
        for (Employee emp : emplist1)
            System.out.println(emp);*/

        //Collections.sort(employeeList, sortByID());
    }
    @Test
    public void sortID() {
        employeeList = createTestData();
        Comparator<Employee> comp = new CompareID2();
        Collections.sort(employeeList,comp);
        System.out.println("Hello world!!!!!!!!!!!!!!!!!!");
        System.out.println(employeeList);

    }


    /*public static Comparator<Employee> sortByID() {
        Comparator compare = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpID() - e2.getEmpID();
            }
        };
        return compare;
    }
    public static Comparator<Employee> sortByDepartment() {
        Comparator compare = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getDepartment().compareTo(e2.getDepartment());
            }
        };
        return compare;
    }*/
}
