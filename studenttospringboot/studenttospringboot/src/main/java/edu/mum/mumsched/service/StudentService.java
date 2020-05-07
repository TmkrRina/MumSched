package edu.mum.mumsched.service;

import edu.mum.mumsched.domain.Student;

public interface StudentService {
	

	void save(Student student);

	public Student getStudentById(Long studentId);

	public Student getStudentByEmail(String studentEmail);


}
