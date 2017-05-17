package com.company.project.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.company.project.model.Order;
import com.company.project.util.MyBatisUtil;

public class TestPropertyColumnNotMatch {

	@Test
	public void testGetOrderById() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.orderMapper.getOrderById";
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}
	
	@Test
	public void testGetOrderUseAlias() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.orderMapper.getOrderUseAlias";
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}
	
	@Test
	public void testGetOrderUseReslutMap() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.orderMapper.getOrderUseResultMap";
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}
	
}
