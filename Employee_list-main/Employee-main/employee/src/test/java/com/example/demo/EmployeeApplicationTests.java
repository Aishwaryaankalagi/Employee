package com.example.demo;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class EmployeeApplicationTests {
	 
	@InjectMocks
	 EmployeeApplication employeeapplication;
	
	@Test
        void contextLoads() {
		employeeapplication.main(new String[] {"abc","xyz"});
		
	}
	
	
}
	

	