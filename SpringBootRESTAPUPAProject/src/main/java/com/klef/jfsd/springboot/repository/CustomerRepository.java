package com.klef.jfsd.springboot.repository;

import org.springframework.data.repository.CrudRepository;  //repositry means data access object
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{ //here we are taking in place of T we take the Customer.java and at the place of ID we will take as Interger if we take username we will use string

}
