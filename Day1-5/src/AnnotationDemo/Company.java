package AnnotationDemo;

import java.lang.annotation.*;
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface Company {
	String name();
	String location();

}