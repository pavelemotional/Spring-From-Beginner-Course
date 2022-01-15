package hibernate_ex.hibernate_ex1;


import hibernate_ex.hibernate_ex1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate\\hibernate.cfg_ex1.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Kiril", "Petrov", "HR", 370);

            session.beginTransaction();
            session.save(emp);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
