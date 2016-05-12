package com.asiainfo.huxin.webservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.huxin.webservice.model.Student;
import com.asiainfo.huxin.webservice.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	
	private final static Log log = LogFactory.getLog(StudentServiceImpl.class);

	@Override
	public Student getStudentById(long id) {
		Student student = null;
		if (id == 1){
			student = new Student ();
			student.setStudentNo(1L);
			student.setName("No.1");
			student.setAge(18);
		}else if (id == 2){
			student = new Student ();
			student.setStudentNo(2L);
			student.setName("No.2");
			student.setAge(19);
		}
		log.debug(student);
		return student;
	}

	@Override
	public List<Student> getStudentByName(String name) {
		List<Student> studentList = new ArrayList<Student> ();
		
		Student student = new Student();
		student.setStudentNo(3L);
		student.setName("No.3");
		student.setAge(20);
		
		Student student2 = new Student();
		student2.setStudentNo(4L);
		student2.setName("No.5");
		student2.setAge(20);
		
		studentList.add(student);
		studentList.add(student2);
		
		log.debug(studentList);
		
		return studentList;
	}

	@Override
	public Response getStudentByAge(int age) {

		List<Student> studentList = new ArrayList<Student>();

		Student student = new Student();
		student.setStudentNo(3L);
		student.setName("No.3");
		student.setAge(20);

		Student student2 = new Student();
		student2.setStudentNo(4L);
		student2.setName("No.5");
		student2.setAge(20);

		studentList.add(student);
		studentList.add(student2);
		
		Student[] students = studentList.toArray(new Student[0]);

		log.debug(students);
		
		return Response.ok(students).build();
	}

	@Override
	public Response getStudentByStudent(Student student) {
		log.debug(student);
		return Response.ok(student).build();
	}

	@Override
	public Response getStudentByStudent2(Student student) {
		log.debug(student);
		return Response.ok(student).build();
	}

}
