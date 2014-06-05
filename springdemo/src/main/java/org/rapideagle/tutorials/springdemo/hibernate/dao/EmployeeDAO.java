package org.rapideagle.tutorials.springdemo.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.rapideagle.tutorials.springdemo.hibernate.entities.Employee;
import org.rapideagle.tutorials.springdemo.hibernate.utility.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("IEmployeeDAO")
public class EmployeeDAO implements IEmployeeDAO 
{
	@Autowired
	SessionFactory sf;
	
	public EmployeeDAO()
	{
		sf = HibernateUtil.getSessionFactory();
	}

	@Override
	@Transactional
	public void addEmployee(Employee emp) 
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.merge(emp);
		
		tr.commit();
		session.close();
	}

	@Override
	@Transactional
	public List<Employee> getEmployee() 
	{
		@SuppressWarnings("unchecked")
		List<Employee> listEmp = sf.openSession().createCriteria(Employee.class).list();
		return listEmp;
	}

}
