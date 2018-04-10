package com.itheima.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.CustomerDao;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;

public class DaoTest {
	
	@Test
	public void findCustomerByIdDaoTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 根据容器中Bean的id来获取指定的Bean
		CustomerDao customerDao = (CustomerDao) applicationContext
				.getBean("customerDao");
		/*
		 * CustomerDao customerDao1 =
		 * applicationContext.getBean(CustomerDao.class);
		 */
		Customer customer = customerDao.findCustomerById(1);
		System.out.println(customer);
	}
	
	@Test
	public void findCustomerByIdMapperTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);
		Customer customer = customerMapper.findCustomerById(1);
		System.out.println(customer);
	}
	
}
