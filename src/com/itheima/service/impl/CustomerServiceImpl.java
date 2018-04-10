package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;
import com.itheima.service.CustomerService;

@Service
//@Transactional  //这里将@Transactional注解进行了注释，是为了先执行此类没有事务管理的情况。之后再删除注释，执行包含事务管理的情况，即可通过结果来验证事务是否配置成功。
public class CustomerServiceImpl implements CustomerService {
	
	//注解注入CustomerMapper
	@Autowired
	private CustomerMapper customerMapper;
	//添加用户
	public void addCustomer(Customer customer) {
		this.customerMapper.addCustomer(customer);
		int i = 1 / 0; //模拟添加操作后系统突然出现的异常问题
	}

}
