package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by badkass on 7/25/2017.
 */
/*
Write a program which will hold salary of 10 employees
        and will increase(by 20%) of those employees where salary
        is less then 20000.00*/
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> salaryList = new ArrayList<>(10);
        salaryList.add(20000.00);
        salaryList.add(400000.00);
        salaryList.add(15000.00);
        salaryList.add(200000.00);
        salaryList.add(900000.00);
        salaryList.add(1000.00);
        salaryList.add(400000.00);
        salaryList.add(400000.00);
        salaryList.add(600000.00);
        salaryList.add(500000.00);

        Iterator<Double> itr = salaryList.iterator();
        int count = 0;
        while (itr.hasNext()) {
            double temp = itr.next();
            if(temp < 20000) {
                salaryList.set(count, temp+(temp*0.2));
            }
            count++;
        }
        System.out.println("Salary Incremented!!!!!!");
        Iterator<Double> itr1 = salaryList.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
