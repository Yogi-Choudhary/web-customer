package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	              /*CREATE METHOD SAVE CUSTOMER*/
	public void saveCustomer(Customer theCustomer);
	              /*CREATE METHOD SAVE CUSTOMER*/
	 
	              /*CREATE METHOD UPDATE CUSTOMER*/
	public Customer getCustomer(int theId);
	              /*CREATE METHOD SAVE CUSTOMER*/
	
	              /*CREATE METHOD DELETE CUSTOMER*/
	public void deleteCustomer(int theId);
	              /*CREATE METHOD DELETE CUSTOMER*/
}