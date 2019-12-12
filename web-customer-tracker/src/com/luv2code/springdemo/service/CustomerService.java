package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	                 /*CREATE METHOD SAVE CUSTOMER */
	public void saveCustomer(Customer theCustomer);
	                /*CREATE METHOD SAVE CUSTOMER */
	
	                 /*CREATE METHOD UPDATE CUSTOMER*/
	public Customer getCustomer(int theId);
	                /*CREATE METHOD UPDATE CUSTOMER*/
	
	                  /*CREATE METHOD 'DELETE CUSTOMER' */
	public void deleteCustomer(int theId);
	                 /*CREATE METHOD 'DELETE CUSTOMER' */
}