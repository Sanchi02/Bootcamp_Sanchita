package com.cdk.xmlExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //FileSystemXmlApplicationContext ==> To keep the config file outside the src
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cdk/xmlExample/spring-config.xml");

        /*Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.getId());
        System.out.println(employee.getName());*/

        Employee e1 = (Employee) context.getBean("e1");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getPhone());

    }
}
