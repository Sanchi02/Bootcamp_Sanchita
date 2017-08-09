package CollectionDemo;

/**
 * Created by badkass on 7/26/2017.
 */
public class Car implements Comparable<Car> {
    int id;
    double price;
    String brand;


    @Override
    public int hashCode() {
        return id;
    }

    public Car(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CollectionDemo.Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(Car o) {
        return this.getId() - o.getId();
    }
}
