package mum.swe.mumsched.repository;

import mum.swe.mumsched.model.Course;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Long> {
	
	@Query("SELECT c FROM Course c")
	public Iterable<Course> courseList(Sort sort);
	
	public Course findOneByCode(String code);
}

