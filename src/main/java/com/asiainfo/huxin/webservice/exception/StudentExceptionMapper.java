package com.asiainfo.huxin.webservice.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class StudentExceptionMapper implements ExceptionMapper<StudentException> {
	@Override
	public Response toResponse(StudentException arg0) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
	}
}
