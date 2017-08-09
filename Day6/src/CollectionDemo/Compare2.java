package CollectionDemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by badkass on 7/26/2017.
 */
public class Compare2 {
    public static void main(String[] args) {
        Set<Car> carSet = createCar();
        Iterator<Car> itr;
        System.out.println("Displaying car list!!!!!");
        System.out.println("============================================");
        display(carSet);

        Comparator<Car> carPriceComparator = new comparePrices();
        Set<Car> carPrice = new TreeSet<>(carPriceComparator);
        carPrice = createCar();

        System.out.println("Displaying sorted list by price");
        System.out.println("============================================");
        display(carPrice);

        Comparator<Car> carBrandComparator = new compareBrand();
        Set<Car> carBrand = new TreeSet<>(carBrandComparator);
        carBrand = createCar();


        System.out.println("Displaying sorted list by brand");
        System.out.println("============================================");
        display(carBrand);

    }

    public static void display(Set<Car> carSet) {
        Iterator<Car> itr = carSet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }


    public static Set<Car> createCar() {
        Set<Car> carSet = new TreeSet<>();
        Car c1 = new Car(2034, 134005.00, "Audi");
        Car c2 = new Car(3954, 434005.00, "Audi");
        Car c3 = new Car(1368, 456005.00, "Mercedes");
        Car c4 = new Car(8967, 135646.00, "Audi");
        Car c5 = new Car(457, 456366.00, "Suzuki");
        Car c6 = new Car(75674, 35736.00, "Audi");
        Car c7 = new Car(287, 144345.00, "Audi");
        Car c8 = new Car(543, 456425.00, "Mercedes");
        Car c9 = new Car(2441, 357626.00, "Alto");
        Car c10 = new Car(8764, 146645.00, "Mercedes");
        Car c11 = new Car(4567, 145456.0, "Audi");
        Car c12 = new Car(1467, 366354.00, "Alto");
        Car c13 = new Car(7534, 436363.00, "Mercedes");

        carSet.add(c1);
        carSet.add(c2);
        carSet.add(c3);
        carSet.add(c4);
        carSet.add(c5);
        carSet.add(c6);
        carSet.add(c7);
        carSet.add(c8);
        carSet.add(c9);
        carSet.add(c10);
        carSet.add(c11);
        carSet.add(c12);
        carSet.add(c13);
        return carSet;
    }
}
