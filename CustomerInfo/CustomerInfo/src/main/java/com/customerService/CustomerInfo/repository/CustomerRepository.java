package com.customerService.CustomerInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerService.CustomerInfo.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
