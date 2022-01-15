package hibernate_ex.hibernate_ex4;

import hibernate_ex.hibernate_ex4.entity.Department;
import hibernate_ex.hibernate_ex4.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_ex3.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 2);

            System.out.println(department);
            System.out.println(department.getEmployees());

            session.getTransaction().commit();
        } finally {
            factory.close();
            assert session != null;
            session.close();
        }

    }
}
