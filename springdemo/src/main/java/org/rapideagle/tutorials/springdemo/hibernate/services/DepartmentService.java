package org.rapideagle.tutorials.springdemo.hibernate.services;

import java.util.List;

import org.rapideagle.tutorials.springdemo.hibernate.dao.DepartmentDAO;
import org.rapideagle.tutorials.springdemo.hibernate.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepartmentService implements IDepartmentService 
{
	@Autowired
	DepartmentDAO deptDAO;
	
	public DepartmentService()
	{
		deptDAO = new DepartmentDAO();
	}

	@Override
	public void addDepartment(Department dept) 
	{
		deptDAO.addDepartment(dept);
	}

	@Override
	public List<Department> getDepartments() 
	{
		return deptDAO.getDepartment();
	}

}
