package com.itheima.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.itheima.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements
		CustomerDao {
	// ͨ��Id��ѯ�ͻ�
	@Override
	public Customer findCustomerById(Integer id) {

		return this.getSqlSession().selectOne(
				"com.itheima.po.CustomerMapper.findCustomerById", id);

	}

}
