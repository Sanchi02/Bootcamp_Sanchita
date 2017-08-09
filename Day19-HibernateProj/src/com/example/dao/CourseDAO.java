package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class CourseDAO {
    public void save(EntityManagerFactory entityManagerFactory) {
        Course c1 = new Course("Hibernate",5,8000);
        Course c2 = new Course("Spring",10,9500);
        Course c3 = new Course("Servlet",2,3700);
        Course c4 = new Course("Java",15,10000);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(c1);
        entityManager.persist(c2);
        entityManager.persist(c3);
        entityManager.persist(c4);
        entityManager.persist(new Course("JQuery",2,3500));
        transaction.commit();
        entityManager.close();


    }

    public void read(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Course course = entityManager.find(Course.class, 2);
        System.out.println(course);
        entityManager.close();
    }

    public  void add() {

    }

    public void delete(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class,2);
        entityManager.remove(course);
        transaction.commit();
        entityManager.close();
    }

    public void update(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Course course = entityManager.find(Course.class,2);
        entityManager.merge(course);
        course.setCourseName("Mockito");
        course = entityManager.find(Course.class,2);
        System.out.println(course);
        entityManager.close();
    }

}
