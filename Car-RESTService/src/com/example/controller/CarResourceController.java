package com.example.controller;

import com.example.dao.CarDAO;
import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.MediaType.*;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;

    @RequestMapping(value = "/car/{vin}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarByVinAsJson(@PathVariable Integer vin){
        Car car = carDAO.selectById(vin);
        return car;
    }

//    @RequestMapping(value = "car", produces = "text/plain", method = RequestMethod.GET)

    @RequestMapping(value = "car", produces = TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public String readInfo() {
        return "VIN:100, Model:Q7, Make:Audi, Price:245343464.00, Quantity:3";
    }

    @RequestMapping(value = "car", produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Car readInfoAsXml() {
       // return "<car><VIN>:100</VIN>, <Model>:Q7</Model><Make>:Audi</Make><Price>:245343464.00</Price><Quantity>:3</Quantity></car>";
        Car car = carDAO.selectById(1000);
        return car;
    }

    @RequestMapping(value = "car", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readInfoAsJSON() {
        //return "{\"VIN\":100, \"Model\":\"Q7\", \"Make\":\"Audi\", \"Price\":245343464.00, \"Quantity\":3}";
        Car car = carDAO.selectById(1000);
        return car;
    }


}
