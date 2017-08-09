package AnnotationDemo;

import java.lang.annotation.*;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV,DEC;
}

enum Year {
    _2015, _2016, _2017, _2018, _2019, _2020;
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@interface Timestamp {
    Day day();
    Month month();
    Year year();

}