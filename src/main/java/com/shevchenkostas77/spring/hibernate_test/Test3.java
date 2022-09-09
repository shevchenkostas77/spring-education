package com.shevchenkostas77.spring.hibernate_test;

import com.shevchenkostas77.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee")
//                    .getResultList(); // all from the table employees

//            List<Employee> emps =  session.createQuery("from Employee " +
//                    "where firstName = 'Aleksandr'")
//                    .getResultList(); // only employees named Alexander

            List<Employee> emps = session.createQuery("from Employee " +
                    "where firstName = 'Aleksandr' AND salary > 650")
                    .getResultList();

            for (Employee emp : emps) {
                System.out.println(emp);
            }

            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
