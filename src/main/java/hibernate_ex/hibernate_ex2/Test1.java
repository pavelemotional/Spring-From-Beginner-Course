package hibernate_ex.hibernate_ex2;

import hibernate_ex.hibernate_ex2.entity.Detail;
import hibernate_ex.hibernate_ex2.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_ex2.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = new Employee("Elena", "Kirilova", "HR", 650);
            Detail detail = new Detail("Bologoe", "+79157457328", "Elena@mail.com");

            detail.setEmployee(employee);
            employee.setEmpDetail(detail);

            session.save(employee);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }

}
