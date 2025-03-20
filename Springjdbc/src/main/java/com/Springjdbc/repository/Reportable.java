package com.Springjdbc.repository;

import java.util.List;

import com.Springjdbc.entity.Student;

public interface Reportable {

	public String testConnection();
	public List<Student> getallStudent();
	public List<Student> getStudentclswise(int cls);
	public Student addStudent(Student stu);
	public Student updatestudent(int cls,Student stu);
	public void deletestudent(int cls);
}
