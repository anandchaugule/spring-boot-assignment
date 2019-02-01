package com.syne.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.syne.main.entities.Student;
import com.syne.main.entities.StudentCache;
import com.syne.main.repo.StudentRepository;
import com.syne.main.service.StudentService;

@RestController
@RequestMapping(value = "/api")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = "/student")
	public List<Student> getAllStudent() {
		return  studentRepository.findAll();
	}
	
	@DeleteMapping(value = "/student/{id}")
	public String deleteStudentById(@PathVariable long id) {
		studentRepository.deleteById(id);
		return new String("Deleted Student Record " + id);		
	}
	
	@RequestMapping(value = "/student/add", method = RequestMethod.POST)
	public List<Student> addStudent(@RequestBody Student studentEntity) {
		studentRepository.save(studentEntity);
		return studentRepository.findAll();
	}
	
	@PutMapping(value = "/student/update")
	public List<Student> updateStudent(@RequestBody Student studentEntity) {
		studentRepository.save(studentEntity);
		return studentRepository.findAll();
	}
	
	@GetMapping(value = "/student/{name}")
	public List<Student> getMethodName(@RequestParam String name) {
		return studentRepository.findByName(name);
	}
	
	@GetMapping(value = "/student/cache/{id}")
	public StudentCache getStudentCacheId(@PathVariable Long id) {
		System.out.println("Id " + id);
		return studentService.getStudentById(id);
	}


}
