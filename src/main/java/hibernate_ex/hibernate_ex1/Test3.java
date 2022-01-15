package hibernate_ex.hibernate_ex1;


import hibernate_ex.hibernate_ex1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate\\hibernate.cfg_ex1.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        List employeeList = null;

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            employeeList = session.createQuery("from Employee").getResultList();
//            employeeList = session.createQuery("from Employee where name = 'Pavel'").getResultList();
            employeeList = session.createQuery(
                    "from Employee where name = 'Pavel' and  salary > 650").getResultList();
            session.getTransaction().commit();

            employeeList.forEach(System.out::println);

        } finally {
            factory.close();
        }

    }
}
