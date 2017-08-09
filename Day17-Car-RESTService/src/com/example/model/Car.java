package com.example.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.beans.Transient;

@XmlRootElement(name="MyCar")

public class Car {

    int vin;
    String model;
    String make;
    double price;
    int quantity;

    public Car() {

    }

    public Car(int vin, String model, String make, double price, int quantity) {
        this.vin = vin;
        this.model = model;
        this.make = make;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (vin != car.vin) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (quantity != car.quantity) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return make != null ? make.equals(car.make) : car.make == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = vin;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        return result;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @XmlTransient
    public double getPrice() {
        return price;
    }

   // @Transient
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
