package mum.swe.mumsched.service;

import mum.swe.mumsched.model.Course;

import java.util.List;

public interface CourseService {
	Iterable<Course> getList();
	Course save(Course course);
	Course findOne(Long id);
	Course findOneByCode(String code);
	void delete(Long id);
	List<Course> findAll();
}
