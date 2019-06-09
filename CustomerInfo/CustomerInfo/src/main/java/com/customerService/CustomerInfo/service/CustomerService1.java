package com.customerService.CustomerInfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.customerService.CustomerInfo.model.Customer;
import com.customerService.CustomerInfo.repository.CustomerRepository;
@Service
public class CustomerService1 {
@Autowired
CustomerRepository customerRepository;

public List<Customer> getAll() {
	return customerRepository.findAll();
}

public Optional<Customer> getCustomer(Long CustomerId) {
	return customerRepository.findById(CustomerId);
}

public void addNewCustomer(Customer customer) {

	System.out.println("object is"+customer);
	customerRepository.save(customer);
	
}
public void deleteAllCustomers() {
	customerRepository.deleteAll();;
}
public customer
}
