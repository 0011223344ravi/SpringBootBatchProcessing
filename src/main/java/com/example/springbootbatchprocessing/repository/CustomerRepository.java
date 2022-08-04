package com.example.springbootbatchprocessing.repository;

import com.example.springbootbatchprocessing.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
