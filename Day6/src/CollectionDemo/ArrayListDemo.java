package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by badkass on 7/25/2017.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> salary = new ArrayList<Integer>(10);
        salary.add(300000);
        salary.add(400000);
        salary.add(406000);
        salary.add(200000);
        salary.add(900000);
        salary.add(10000000);
        salary.add(400000);
        salary.add(400000);
        salary.add(600000);
        salary.add(500000);

        Iterator<Integer> itr = salary.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() * 0.3);
        }
    }
}
