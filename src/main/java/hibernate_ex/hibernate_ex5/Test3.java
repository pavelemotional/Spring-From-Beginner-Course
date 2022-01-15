package hibernate_ex.hibernate_ex5;

import hibernate_ex.hibernate_ex5.entiti.Children;
import hibernate_ex.hibernate_ex5.entiti.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_ex4.xml")
                .addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Section section1 = session.get(Section.class, 5);
            session.delete(section1);

            session.getTransaction().commit();
        } finally {
            factory.close();
            assert session != null;
            session.close();
        }

    }
}
