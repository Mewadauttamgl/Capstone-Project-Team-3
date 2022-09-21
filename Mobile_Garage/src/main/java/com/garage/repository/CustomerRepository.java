package com.garage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garage.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
