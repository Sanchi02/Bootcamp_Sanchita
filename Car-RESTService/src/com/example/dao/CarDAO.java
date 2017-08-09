package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CarDAO {

    Map<Integer,Car> cars = null;

    @PostConstruct
    public void init() {
        cars = new HashMap<>();
        cars.put(1000, new Car(1000,"X5", "BMW", 4554373.00, 6));
        cars.put(2000, new Car(2000,"A1", "Audi", 3454373.00, 8));
        cars.put(3000, new Car(3000,"Q7", "Audi", 425373.00, 10));
        cars.put(4000, new Car(4000,"B6", "Jaguar", 4234373.00, 1));
        cars.put(5000, new Car(5000,"J8", "Jaguar", 6754373.00, 4));
    }

    @PreDestroy
    public void clean() {
        cars.clear();
        cars = null;
    }
    public Car selectById(int vin) {
        //JDBC Logic
        //return new Car(1000,"X5", "BMW", 4554373.00, 6);
        return cars.get(vin);
    }
}
