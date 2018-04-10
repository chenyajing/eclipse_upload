package com.itheima.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.po.Customer;
import com.itheima.service.CustomerService;
/**
 * ≤‚ ‘ ¬ŒÒ
 */
public class TransactionTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
		Customer customer = new Customer();
		customer.setUsername("zhangsan");
		customer.setJobs("manager");
		customer.setPhone("13233334444");
		customerService.addCustomer(customer);
		
	}
}
