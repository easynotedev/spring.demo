package com.accenture.jpa.jersey.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.jpa.jersey.domain.Employee;
import com.accenture.jpa.jersey.domain.EmployeeRepository;

@Path("employeeservice")
public class EmployeeService {

	@Autowired
	private EmployeeRepository emp;

//	http://localhost:9095/employeeservice/save
	@POST
	@Path("save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployee(Employee employee) throws JSONException{
		emp.save(employee);
		JSONObject json = new JSONObject();
		json.put("INFO", "Employee Created! ");
		return Response.status(200).entity(json.toString())
				.type(MediaType.APPLICATION_JSON).build();
	}

	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployee(){
		return emp.findAll();
	}

//	http://localhost:9095/employeeservice/find/ASE
	@GET
	@Path("find/{level}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findLevel(@PathParam("level") String companylevel) throws JSONException{
		Employee employee = emp.findByLevel(companylevel);
		JSONObject json = new JSONObject();
		json.put("Name of employee", employee.getName());
		json.put("Level of employee", employee.getLevel());

		return Response.status(200).entity(json.toString())
				.type(MediaType.APPLICATION_JSON).build();
	}
}
