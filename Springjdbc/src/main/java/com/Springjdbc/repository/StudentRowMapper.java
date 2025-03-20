package com.Springjdbc.repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.Springjdbc.entity.Student;



public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student =new Student();

		student.setName(rs.getString("name"));
		student.setCls(rs.getInt("class"));
		student.setRoll(rs.getInt("roll"));

		return student;
	}

}
