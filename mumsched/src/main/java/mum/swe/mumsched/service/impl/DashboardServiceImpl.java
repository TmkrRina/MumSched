package mum.swe.mumsched.service.impl;

import mum.swe.mumsched.repository.CourseRepository;
import mum.swe.mumsched.repository.FacultyRepository;
import mum.swe.mumsched.repository.SectionRepository;
import mum.swe.mumsched.repository.StudentRepository;
import mum.swe.mumsched.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dashboardService")
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private CourseRepository courseRepository;
    
    @Autowired
    private FacultyRepository facultyRepository;
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private SectionRepository sectionRepository;
	
	@Override
	public Long countStudents() {
		return studentRepository.count();
	}

	@Override
	public Long countFaculties() {
		return facultyRepository.count();
	}

	@Override
	public Long countCourses() {
		return courseRepository.count();
	}

	@Override
	public Long countSections() {
		return sectionRepository.count();
	}

}
