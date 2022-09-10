package com.shevchenkostas77.spring.hibernate_one_to_one;

import com.shevchenkostas77.spring.hibernate_one_to_one.entity.Detail;
import com.shevchenkostas77.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

//        try (factory; Session session = factory.getCurrentSession()) {
////            some code
//        }

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Stas", "Shevchenko",
//                    "IT", 500);
//            Detail detail = new Detail("Moscow", "123456789",
//                    "shevchenkostas77@icloud.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Smirnov",
//                    "Sales", 700);
//            Detail detail = new Detail("Moscow", "987654321",
//                    "olejka@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
