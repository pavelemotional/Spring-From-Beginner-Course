package hibernate_ex.hibernate_ex4;

import hibernate_ex.hibernate_ex4.entity.Department;
import hibernate_ex.hibernate_ex4.entity.Employee;
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

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = new Department("HR", 300, 1700);
            Employee employee1 = new Employee("Oleg", "Ivanov", 650);
            Employee employee2 = new Employee("Uliya", "Dmitrieva", 1300);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.save(department);
            session.getTransaction().commit();
        } finally {
            factory.close();
            assert session != null;
            session.close();
        }

    }
}
