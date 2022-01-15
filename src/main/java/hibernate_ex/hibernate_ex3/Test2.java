package hibernate_ex.hibernate_ex3;

import hibernate_ex.hibernate_ex3.entity.Department;
import hibernate_ex.hibernate_ex3.entity.Employee;
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

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 5);
            System.out.println(department);
            System.out.println(department.getEmployees());

//            Employee employee = session.get(Employee.class, 3);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}

