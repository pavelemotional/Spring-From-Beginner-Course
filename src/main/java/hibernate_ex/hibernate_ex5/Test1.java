package hibernate_ex.hibernate_ex5;

import hibernate_ex.hibernate_ex5.entiti.Children;
import hibernate_ex.hibernate_ex5.entiti.Section;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
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

            Section section1 = new Section("Football");
            Children children1 = new Children("Pavel", 5);
            Children children2 = new Children("Kiril", 6);
            Children children3 = new Children("Nastya", 5);
            Children children4 = new Children("Vova", 7);
            section1.addChildren(children1);
            section1.addChildren(children2);
            section1.addChildren(children3);
            section1.addChildren(children4);
            session.save(section1);

//            Section section2 = new Section("Voleyball");
//            Section section3 = new Section("Chess");
//            Section section4 = new Section("Math");
//            Children children5 = new Children("Igor", 9);
//            children5.addSection(section2);
//            children5.addSection(section3);
//            children5.addSection(section4);
//            session.save(children5);

            session.getTransaction().commit();
        } finally {
            factory.close();
            assert session != null;
            session.close();
        }

    }
}
