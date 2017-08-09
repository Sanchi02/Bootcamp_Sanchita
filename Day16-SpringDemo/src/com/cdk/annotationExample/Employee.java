package com.cdk.annotationExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//Class will deploy as a bean using component annotation
public class Employee {
    @Value("2340") //For passing primitive values
    int id;

    @Value("Ross")
    String name;

    @Value("56456")
    String phone;

    //Autowiring occurs by (By type==>(class name can be solved by annotation (Qualifier)) and by name ==>(vairable name can be changed to bean name))

    //First by name then by type
    @Autowired
    Address address;

    public Employee() {
    }

    public Employee(String phone, int id) {
        this.id = id;
        this.phone = phone;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
