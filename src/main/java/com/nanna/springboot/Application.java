package com.nanna.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.nanna.springboot.dao.EmployeeRepository;
import com.nanna.springboot.entity.Employee;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository; 
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Bean("restTemplate")
    public RestTemplate getResttemplate() {
        return new RestTemplate();
    }

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee("nanna!", "Dash", "109", null)); 
		
	}
}
