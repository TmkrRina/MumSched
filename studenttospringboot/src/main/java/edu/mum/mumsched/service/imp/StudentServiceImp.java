package edu.mum.mumsched.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.mumsched.dao.StudentDao;
import edu.mum.mumsched.domain.Student;
import edu.mum.mumsched.service.StudentService;
@Service
public class StudentServiceImp implements StudentService {
@Autowired
StudentDao studentdao;

//Add new student
public void save(Student student) {
    	studentdao.save(student);
    	return;
    }
public Student getStudentById(Long studentId) {
    	return studentdao.findStudentByid(studentId);
    	
    }
public Student getStudentByEmail(String studentEmail) {
    	return studentdao.findStudentByEmail(studentEmail);
    	
    }
}
