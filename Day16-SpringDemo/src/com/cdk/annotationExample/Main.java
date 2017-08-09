package com.cdk.annotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cdk/annotationExample/appCxt.xml");

       // Employee employee = (Employee) context.getBean("employee");
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getPhone());

    }
}
