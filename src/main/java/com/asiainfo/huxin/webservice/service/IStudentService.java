package com.asiainfo.huxin.webservice.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.asiainfo.huxin.webservice.model.Student;

@Path(value="/student/{id}")
@Produces("application/xml")
public interface IStudentService {
	@GET
	@Path(value="/getStudentById")
	public Student getStudentById (@PathParam("id") long id);
	
	@GET
	@Path(value="/getStudentByName")
	public List<Student> getStudentByName (@PathParam("name") String name);
	
	@GET
	@Path(value="/getStudentByAge")
	public Response getStudentByAge (@PathParam("age") int age);
	
	@GET
	@Path(value="/getStudentByStudent/{studentNo}/{name}")
	public Response getStudentByStudent (@PathParam("")Student student);
	
	@GET
	@Path(value="/getStudentByStudent2/matrix")
	public Response getStudentByStudent2 (@MatrixParam("")Student student);
}
