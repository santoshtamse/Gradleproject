package main.java.dao;

import main.java.model.Department;
import main.java.model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void addEmployee() {

		try {
			System.out.println("---------------in seeeeeeeeeeeeeeessssssssssssssssss---------------");
			Session session =  this.sessionFactory.openSession();
			session.beginTransaction();
			System.out.println("---------------in add employee---------------");
			Department department = new Department();
			department.setDepartmentCode(4444);
			department.setDepartmentName("Networking");

			session.save(department);

			System.out.println("---------------in after department save---------------");
			Employee employee = new Employee();
			employee.setEmpName("suuntosh");
			employee.setSex("male");
			employee.setDepartment(department);

		//	department.getEmployee().add(employee);
			session.save(employee);

			session.getTransaction().commit();
			session.close();

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
