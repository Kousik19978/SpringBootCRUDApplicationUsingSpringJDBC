package com.Springjdbc.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Springjdbc.entity.Student;

@Repository
public class ReportService implements Reportable{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String testConnection() {		
		  return jdbcTemplate.queryForObject("SELECT 'Connection Successful' AS message", String.class);
	}
	
	@Override
	public List<Student> getallStudent() {
		String query="select * from student";
		return jdbcTemplate.query(query, new StudentRowMapper());
		//List<Student> allStudent= jdbcTemplate.query(query,new BeanPropertyRowMapper <>(Student.class));
		 //jdbcTemplate.queryForObject(query,new BeanPropertyRowMapper <>(Student.class)); //queryForObject for reurn single obj
		//return allStudent;
	}

	@Override
	public List<Student> getStudentclswise(int cls) {
		String query="select * from student where [class] = ? ";
		return  jdbcTemplate.query(query, new Object[]{cls}, new StudentRowMapper());
		 //return  jdbcTemplate.query(query, new Object[]{cls}, new BeanPropertyRowMapper <>(Student.class));
		
	}

	@Override
	public Student addStudent(Student stu) {
		String query="insert into student ([name],[class],[roll]) values (?,?,?)";
		 jdbcTemplate.update(query,stu.getName(),stu.getCls(),stu.getRoll());
		return stu;
	}

	@Override
	public Student updatestudent(int cls, Student stu) {
		String query="update student set [name] = ? ,[class] = ?,[roll] = ? where [class] = ? ";
		jdbcTemplate.update(query,stu.getName(),stu.getCls(),stu.getRoll(),cls);
		
		return stu;
	}

	@Override
	public void deletestudent(int cls) {
		String query="delete from student where [class] = ?";
		jdbcTemplate.update(query,cls);
	}

	

}
