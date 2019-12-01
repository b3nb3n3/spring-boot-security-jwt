package com.ben.spring.service;

import com.ben.spring.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> findAll();

    public Customer findById(int theId);

    public void save(Customer theEmployee);

    public void deleteById(int theId);
}
