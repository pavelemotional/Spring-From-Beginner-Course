package hibernate_ex.hibernate_ex2;

import hibernate_ex.hibernate_ex2.entity.Detail;
import hibernate_ex.hibernate_ex2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_ex2.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 3);

            session.delete(emp);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }

}
