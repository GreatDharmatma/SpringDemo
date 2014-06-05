package org.rapideagle.tutorials.springdemo.hibernate.services;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;  
import org.springframework.transaction.annotation.Transactional;
import org.rapideagle.tutorials.springdemo.hibernate.dao.EmployeeDAO;
import org.rapideagle.tutorials.springdemo.hibernate.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
public class EmployeeService implements IEmployeeService 
{
	@Autowired
	private EmployeeDAO empDAO;
	
	public EmployeeService()
	{
		empDAO = new EmployeeDAO();
	}

	@Override	
	public void addEmployee(Employee emp)
	{
		empDAO.addEmployee(emp);
	}

	@Override
	public List<Employee> getEmployee() 
	{
		return empDAO.getEmployee();
	}

}
