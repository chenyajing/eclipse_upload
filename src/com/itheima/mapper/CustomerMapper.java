package com.itheima.mapper;

import com.itheima.po.Customer;

public interface CustomerMapper {
	//ͨ��Id��ѯ�ͻ�
	public Customer findCustomerById(Integer id);
	//��ӿͻ�
	public void addCustomer(Customer customer);
}
