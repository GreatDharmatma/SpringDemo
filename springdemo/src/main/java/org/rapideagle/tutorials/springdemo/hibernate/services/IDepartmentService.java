package org.rapideagle.tutorials.springdemo.hibernate.services;

import java.util.List;

import org.rapideagle.tutorials.springdemo.hibernate.entities.Department;

public interface IDepartmentService 
{
	public void addDepartment(Department dept);
	public List<Department> getDepartments();
}
