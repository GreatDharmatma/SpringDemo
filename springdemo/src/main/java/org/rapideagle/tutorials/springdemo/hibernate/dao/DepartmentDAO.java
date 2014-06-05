package org.rapideagle.tutorials.springdemo.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.rapideagle.tutorials.springdemo.hibernate.entities.Department;
import org.rapideagle.tutorials.springdemo.hibernate.utility.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("IDepartmentDAO")
public class DepartmentDAO implements IDepartmentDAO 
{	
	@Autowired
	private SessionFactory sf;
	
	public DepartmentDAO()
	{
		sf = HibernateUtil.getSessionFactory();
	}

	@Override
	@Transactional
	public void addDepartment(Department dept) 
	{
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        
        session.save(dept);
        
        tr.commit();
        session.close();
	}

	@Override
	@Transactional
	public List<Department> getDepartment() 
	{
		@SuppressWarnings("unchecked")
		List<Department> deptList = sf.openSession().createCriteria(Department.class).list();
		return deptList;
	}

}
