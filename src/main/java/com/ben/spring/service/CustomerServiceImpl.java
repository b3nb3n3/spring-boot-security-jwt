package com.ben.spring.service;

import com.ben.spring.dao.CustomerRepository;
import com.ben.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int theId) {
        Optional<Customer> result = customerRepository.findById(theId);
        Customer customer = null;

        if (result.isPresent()) {
            customer = result.get();
        }else {
            throw new RuntimeException("Did not find...");
        }

        return customer;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteById(int theId) {
        customerRepository.deleteById(theId);
    }
}
