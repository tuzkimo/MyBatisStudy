package com.company.project.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.company.project.model.User;
import com.company.project.util.MyBatisUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCRUDByXMLMapper {

	@Test
	public void test1Add() {
		// SqlSession sqlSession = MyBatisUtil.geSqlSession(false);
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		// 映射 SQL 标识字符串
		String statement = "com.company.project.mapper.userMapper.addUser";
		User user = new User();
		user.setName("李狗蛋");
		user.setAge(1);
		// 执行插入操作
		int retResult = sqlSession.insert(statement, user);
		// 手动提交事务
		// sqlSession.commit();
		// 执行完 SQL 后需要关闭 sqlSession
		sqlSession.close();
		System.out.println(retResult);
	}
	
	@Test
	public void test2Update() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.userMapper.updateUser";
		User user = new User();
		user.setId(3);
		user.setName("张全蛋");
		user.setAge(21);
		// 执行更新操作
		int retResult = sqlSession.update(statement, user);
		sqlSession.close();
		System.out.println(retResult);
	}
	
	@Test
	public void test3Delete() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.userMapper.delUser";
		// 执行删除操作
		int retResult = sqlSession.delete(statement, 3);
		sqlSession.close();
		System.out.println(retResult);
	}
	
	@Test
	public void test4GetAll() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.userMapper.getAllUsers";
		// 执行查询操作
		List<User> userList = sqlSession.selectList(statement);
		sqlSession.close();
		System.out.println(userList);
	}
	
}
