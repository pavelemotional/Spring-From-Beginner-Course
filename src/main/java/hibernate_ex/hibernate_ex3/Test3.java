package hibernate_ex.hibernate_ex3;

import hibernate_ex.hibernate_ex3.entity.Department;
import hibernate_ex.hibernate_ex3.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_ex3.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 3);

            session.delete(department);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}

