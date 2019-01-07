package com.accenture.jpa.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.accenture.jpa.jersey.service.EmployeeService;

@Configuration
public class JerseyConfig extends ResourceConfig {

	JerseyConfig(){
		register(EmployeeService.class);
	}

}
