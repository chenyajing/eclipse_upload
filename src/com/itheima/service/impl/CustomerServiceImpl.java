package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;
import com.itheima.service.CustomerService;

@Service
//@Transactional  //���ｫ@Transactionalע�������ע�ͣ���Ϊ����ִ�д���û���������������֮����ɾ��ע�ͣ�ִ�а��������������������ͨ���������֤�����Ƿ����óɹ���
public class CustomerServiceImpl implements CustomerService {
	
	//ע��ע��CustomerMapper
	@Autowired
	private CustomerMapper customerMapper;
	//����û�
	public void addCustomer(Customer customer) {
		this.customerMapper.addCustomer(customer);
		int i = 1 / 0; //ģ����Ӳ�����ϵͳͻȻ���ֵ��쳣����
	}

}
