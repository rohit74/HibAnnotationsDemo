/**
 * 
 */
/**
 * @author rohit
 *
 */
package com.kushal.dao;
import java.util.List;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kushal.entities.Employee;
public class ManageEmployee
{
	private static SessionFactory factory;
	public static void main(String[] args) 
	{
	try{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
	}catch(Throwable ex){
		System.err.println("Failed to create a sessionFactory object." + ex);
		
	}
		
		ManageEmployee e = new ManageEmployee();
		e.add();
	}

	private void add()
	{
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setfName("Binaya");
		e.setlName("Pqr");
		e.setSalary(15000);
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(e);
		
		t.commit();
		session.close();
	}
	
	public void update(int id,String firstName,String lastName)
	{
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp = (Employee) session.get(Employee.class, id);
		emp.setfName(firstName);
		emp.setlName(lastName);
		int salary = emp.getSalary()+10;
		emp.setSalary(salary);
		session.saveOrUpdate(emp);
		t.commit();
		session.close();
		System.out.println("Update successful");
	}
	
	public void delete(int id)
	{
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp = (Employee) session.get(Employee.class, id);
		session.delete(emp);
		
		t.commit();
		session.close();
		System.out.println("delete successful");
	}
}
