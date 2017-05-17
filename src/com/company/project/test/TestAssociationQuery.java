package com.company.project.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.company.project.model.Class;
import com.company.project.util.MyBatisUtil;

public class TestAssociationQuery {

	@Test
	public void testGetClass1() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.classMapper.getClass1";
		Class clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(clazz);
	}
	
	@Test
	public void testGetClass2() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.classMapper.getClass2";
		Class clazz = sqlSession.selectOne(statement, 2);
		sqlSession.close();
		System.out.println(clazz);
	}
	
	@Test
	public void testGetClass3() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.classMapper.getClass3";
		Class clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(clazz);
	}
	
	@Test
	public void testGetClass4() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.classMapper.getClass4";
		Class clazz = sqlSession.selectOne(statement, 2);
		sqlSession.close();
		System.out.println(clazz);
	}

}
