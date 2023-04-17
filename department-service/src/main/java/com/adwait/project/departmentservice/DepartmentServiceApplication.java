package com.adwait.project.departmentservice;

import org.modelmapper.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentServiceApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
