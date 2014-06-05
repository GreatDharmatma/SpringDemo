package org.rapideagle.tutorials.springdemo.hibernate.dao;

import java.util.List;

import org.rapideagle.tutorials.springdemo.hibernate.entities.Department;

public interface IDepartmentDAO 
{
	public void addDepartment(Department dept);
	public List<Department> getDepartment();
}
