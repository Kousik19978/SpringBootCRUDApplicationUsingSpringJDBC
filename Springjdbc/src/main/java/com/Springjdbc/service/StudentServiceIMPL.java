package com.Springjdbc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springjdbc.entity.Student;
import com.Springjdbc.repository.Reportable;



@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private Reportable dao;
	
	public StudentServiceIMPL() {
		
	}

	@Override
	public List<Student> getallStudent() {					
		
		return dao.getallStudent();
	}

	@Override
	public List<Student> getStudentclswise(int cls) {
		
		return dao.getStudentclswise(cls);
	}

	@Override
	public Student addStudent(Student stu) {
		
		 dao.addStudent(stu);
		 return stu;
	}

	@Override
	public Student updatestudent(int cls,Student stu) {
		dao.updatestudent(cls,stu);
		 return stu;
	}

	@Override
	public void deletestudent(int cls) {
		dao.deletestudent(cls);
		
	}

	@Override
	public String testConnection() {
		return dao.testConnection();
	}
	
	
	


}
