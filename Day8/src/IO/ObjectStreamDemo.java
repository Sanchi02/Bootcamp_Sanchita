package IO;
import java.io.*;
import java.util.*;

/**
 * Created by badkass on 7/27/2017.
 */

/*
Write a program which will hold 10-50 employees in an array list.
        Application will first find those employees who are getting salary
        more then 40000 per month and then will sort them.
        And application will save sorted ones in a file before quiting
        with full details except their salaries and the will retrieve
        them and display the details on console in sorted way only
        based on natural sorting decided by eid field.
*/

public class ObjectStreamDemo {
    public static void main(String[] args) {
/* empList = Employee List with all data;
    empListHigherSalary  = Employees with salary greater than 40000
    SalaryComparator = Logic for sorting with respect to salary

 */
        ArrayList<Employee> empList = new ArrayList<>();
        createEmployeeData(empList);
        ArrayList<Employee> empListHigherSalary = new ArrayList<>();
        Comparator<Employee> employeeComparator = SalaryComparator(empList, empListHigherSalary);
        Collections.sort(empListHigherSalary, employeeComparator);
        WriteToFile(empListHigherSalary);
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("C:/Users/badkass/IdeaProjects/Bootcamp007/Day8/src/IO/EmployeeHigherSalary");
            ois = new ObjectInputStream(fis);
            ArrayList<Employee> sortedByIDS = new ArrayList<>();
            DisplayIDSorted(empListHigherSalary, ois, sortedByIDS);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void DisplayIDSorted(ArrayList<Employee> empListHigherSalary, ObjectInputStream ois, ArrayList<Employee> sortedByIDS) throws IOException, ClassNotFoundException {
        for (int i = 0; i < empListHigherSalary.size()-1; i++) {
            Employee p = (Employee) ois.readObject();
            sortedByIDS.add(p);
        }
        Comparator<Employee> IDCompare = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getUid()-o2.getUid();
            }
        };
        Collections.sort(sortedByIDS,IDCompare);
        Iterator<Employee> itr = sortedByIDS.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void WriteToFile(ArrayList<Employee> empListHigherSalary) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("C:/Users/badkass/IdeaProjects/Bootcamp007/Day8/src/IO/EmployeeHigherSalary");
            oos = new ObjectOutputStream(fos);
            Iterator itr = empListHigherSalary.iterator();
            while (itr.hasNext()) {
                oos.writeObject(itr.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Comparator<Employee> SalaryComparator(ArrayList<Employee> empList, ArrayList<Employee> empListHigherSalary) {
        Iterator<Employee> itr = empList.iterator();

        while (itr.hasNext()) {
            Employee temp = itr.next();
            if (temp.getSalary() > 40000) {
                empListHigherSalary.add(temp);
            }
        }

        return new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary()-o2.getSalary());
            }
        };
    }

    private static void createEmployeeData(ArrayList<Employee> empList) {
        Employee e1 = new Employee(46, "Ramesh", 23425.00, "Mumbai");
        Employee e2 = new Employee(453, "Suresh", 400005.00, "Pune");
        Employee e3 = new Employee(76, "Ram", 435234.00, "Goa");
        Employee e4 = new Employee(547, "Naresh", 351543.00, "Chandigarh");
        Employee e5 = new Employee(76568, "Ricky", 12442.00, "Rajasthan");
        Employee e6 = new Employee(655, "Micky", 234655.00, "Canada");
        Employee e7 = new Employee(467, "Joe", 2455643.00, "Kerla");
        Employee e8 = new Employee(236, "Doe", 34264.00, "Andhra");
        Employee e9 = new Employee(5567, "Joey", 13234.00, "Pune");
        Employee e10 = new Employee(134, "Chandler", 3464664.00, "Mumbai");
        Employee e11 = new Employee(805, "Monica", 234435.00, "Mumbai");
        Employee e12 = new Employee(546, "Rachel", 235664.00, "Mumbai");
       // Employee e13 = new Employee(5463, "Phoebe", 2345664.00, "Mumbai");


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
    }

}
