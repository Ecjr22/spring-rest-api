package com.carmona.spring.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carmona.spring.dao.CustomerDAO;
import com.carmona.spring.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

	private CustomerDAO customerRepo;
	
	@GetMapping("/{theId}")
	public Customer getCustomerById(@PathVariable int theId) {
		
		Customer customer = customerRepo.getCustomer(theId);
		
		return customer;
	}
	
	@GetMapping("/helloWorld")
	public String getStringResponse() {
		
		return "hello world";
	}
}
