package CollectionDemo;

import java.util.*;

/**
 * Created by badkass on 7/26/2017.
 */
public class Compare {
    /*Write a program which will hold CollectionDemo.Car class 20-30 objects in
    a collection of right type and we have to display those cars
    on top which are having higher price.

    Plus user should be able to show cars sorted by ids.
    Plus user should be able to show cars sorted by brand.
    Plus user should not be able to save duplicate cars*/

    public static void main(String[] args) {
        List<Car> cars = createCarList();
        Iterator<Car> itr;
        System.out.println("How do you wish to sort the cars??");
        Scanner scan = new Scanner(System.in);
        System.out.println("1. By IDS");
        System.out.println("2. By Prices");
        System.out.println("3. By Brand");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                sortByID(cars);
                break;
            case 2:
                sortByPrices(cars);
                break;
            case 3:
                sortByBrand(cars);
                break;
        }
    }

    public static void sortByBrand(List<Car> cars) {
        Iterator<Car> itr;
        System.out.println("Sorting by Brand");
        Comparator<Car> carBrandComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        };

        cars.sort(carBrandComparator);
        itr = cars.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public static void sortByPrices(List<Car> cars) {
        Iterator<Car> itr;
        System.out.println("Sorting by Prices");
        Comparator<Car> carPriceComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getPrice() < o2.getPrice())
                    return 1;
                else if (o1.getPrice() == o2.getPrice())
                    return 0;
                else
                    return -1;
            }
        };

        cars.sort(carPriceComparator);
        itr = cars.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public static void sortByID(List<Car> cars) {
        System.out.println("Sorting by IDS");
        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getId() - o2.getId();
            }
        };

        cars.sort(carComparator);
        Iterator<Car> itr = cars.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public static List<Car> createCarList() {
        List<Car> cars = new ArrayList<>();
        cars = Arrays.asList(
                new Car(2034, 134005.00, "Audi"),
                new Car(3954, 434005.00, "Audi"),
                new Car(1368, 456005.00, "Mercedes"),
                new Car(8967, 135646.00, "Audi"),
                new Car(457, 456366.00, "Suzuki"),
                new Car(75674, 35736.00, "Audi"),
                new Car(543, 456425.00, "Mercedes"),
                new Car(287, 144345.00, "Audi"),
                new Car(2441, 357626.00, "Alto"),
                new Car(4567, 145456.0, "Audi"),
                new Car(8764, 146645.00, "Mercedes"),
                new Car(1467, 366354.00, "Alto"),
                new Car(7534, 436363.00, "Mercedes"));
        return cars;
    }
}
