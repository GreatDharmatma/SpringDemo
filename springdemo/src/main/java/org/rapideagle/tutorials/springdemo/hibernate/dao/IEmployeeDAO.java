package org.rapideagle.tutorials.springdemo.hibernate.dao;

import java.util.List;

import org.rapideagle.tutorials.springdemo.hibernate.entities.Employee;

public interface IEmployeeDAO 
{
	public void addEmployee(Employee emp);
	public List<Employee> getEmployee();
}
