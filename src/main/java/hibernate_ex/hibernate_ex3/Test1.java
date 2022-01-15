package hibernate_ex.hibernate_ex3;

import hibernate_ex.hibernate_ex3.entity.Department;
import hibernate_ex.hibernate_ex3.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_ex3.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Department department1 = new Department("IT", 400, 2000);
            Department department2 = new Department("Sales", 300, 1500);

            Employee employee1 = new Employee("Pavel", "Yakovelev", 1500, department1);
            Employee employee2 = new Employee("Elena", "Smirnova", 1750, department1);
            Employee employee3 = new Employee("Igor'", "Nikolaev", 1750, department1);

            department1.addEmployeeToDepartment(employee1);
            department1.addEmployeeToDepartment(employee2);
            department1.addEmployeeToDepartment(employee3);

            session.save(department1);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}

