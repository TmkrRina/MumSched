package mum.swe.mumsched.service;

import mum.swe.mumsched.model.Student;

import java.util.List;

public interface StudentService {
	Student save(Student student);
	Student findOne(Long id);
	void delete(Long id);
	List<Student> findAll();
	
	Student findByUsername(String userName);
}
