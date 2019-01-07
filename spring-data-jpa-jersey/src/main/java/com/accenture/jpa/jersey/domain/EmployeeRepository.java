package com.accenture.jpa.jersey.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findByLevel(String level);

}
