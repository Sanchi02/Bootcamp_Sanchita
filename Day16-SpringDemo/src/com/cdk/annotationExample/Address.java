package com.cdk.annotationExample;

import org.springframework.stereotype.Component;

@Component
public class Address {
    String city;

    public String getCity() {
        return city;
    }


    //For setter based injection
    //@Autowired
    public void setCity(String city) {
        this.city = city;
    }
}
