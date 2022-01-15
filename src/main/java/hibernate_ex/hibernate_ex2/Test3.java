package hibernate_ex.hibernate_ex2;

import hibernate_ex.hibernate_ex2.entity.Detail;
import hibernate_ex.hibernate_ex2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
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

//            Employee emp = session.get(Employee.class, 6);
//            session.delete(emp);

            Detail detail = session.get(Detail.class, 2);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }

}
