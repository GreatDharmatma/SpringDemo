package org.rapideagle.tutorials.springdemo.hibernate.services;

import java.util.List;

import org.rapideagle.tutorials.springdemo.hibernate.entities.Employee;

public interface IEmployeeService 
{
	public void addEmployee(Employee emp);
	public List<Employee> getEmployee();
}
