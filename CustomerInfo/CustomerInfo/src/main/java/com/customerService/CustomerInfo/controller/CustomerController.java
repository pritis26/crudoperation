package com.customerService.CustomerInfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.customerService.CustomerInfo.model.Customer;
import com.customerService.CustomerInfo.service.CustomerService1;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	CustomerService1 customerService1;
	
@GetMapping("/getall")
public List<Customer> getAllCustomers()
{
	return customerService1.getAll();
	}

@PostMapping(value="/addcustomer",consumes=MediaType.APPLICATION_JSON_VALUE)
public void addNewCustomer(@RequestBody Customer customer) {
	
	System.out.println("adding customer"+customer);
	customerService1.addNewCustomer(customer);
	
}
@GetMapping("/getcustomer/{customerId}")
public Optional<Customer> getCustomer(@PathVariable Long customerId) {
	return customerService1.getCustomer(customerId);
}
@DeleteMapping("/deleteall")
public void deleteAllCustomers() {
	customerService1.deleteAllCustomers();
}
}
