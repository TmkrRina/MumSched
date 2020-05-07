package edu.mum.mumsched.controllers;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.mumsched.domain.Student;
import edu.mum.mumsched.service.StudentService;

@Controller
public class StudentController {


	@Autowired
    StudentService studentservice;
	

    @RequestMapping(value="/",method=RequestMethod.GET)
    public String studentRegForm(@ModelAttribute("newStudent") Student student, Model model) {

       model.addAttribute("newStudent",student);
    return "Student/studentregform";
    }
    
    
    @RequestMapping(value= {"/addnewstudent"},method=RequestMethod.POST)
    public String registerStudent(@ModelAttribute("newStudent") Student student, Model model ) {
    //student saved in persistence
        studentservice.save(student);    
    
       model.addAttribute(studentservice.getStudentByEmail(student.getEmail()));
       return "Student/addsuccess";
    }
}
