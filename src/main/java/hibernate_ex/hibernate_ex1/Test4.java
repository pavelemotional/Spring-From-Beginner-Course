package hibernate_ex.hibernate_ex1;


import hibernate_ex.hibernate_ex1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate\\hibernate.cfg_ex1.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            emp.setSalary(1500);

            session.createQuery("update Employee set salary = salary + 100 where department = 'HR'")
                    .executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
