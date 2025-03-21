package com.Springjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springjdbc.entity.Student;
import com.Springjdbc.service.StudentService;



@RestController
@RequestMapping("/student")
public class MyController {
	
	@Autowired
	public StudentService sc;
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to My home.";		
	}
	
	@GetMapping("/testConnection")
	public String testConnection() {
		
		return sc.testConnection();	
	}
	
	@GetMapping("/allStudent")
	public List<Student> getallStudent(){
		
		return sc.getallStudent();
		
	}
	@GetMapping("/studentdataclswise/{cls}")
	public List<Student> getStudentclswise(@PathVariable ("cls")int cls){		
		return sc.getStudentclswise(cls);
		
	}
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student stu) {
		
		return sc.addStudent(stu);
	}
	
	@PutMapping("/update/{cls}")
	public Student updateStudent(@PathVariable ("cls")int cls,@RequestBody Student stu) {
		
		return sc.updatestudent(cls,stu);
	}

	@DeleteMapping("/studentdelete/{cls}")
	public void deletestudent(@PathVariable ("cls") int cls){		
		 sc.deletestudent(cls);
		
	}
	
}
