package com.company.project.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.company.project.mapper.userMapperI;
import com.company.project.model.User;
import com.company.project.util.MyBatisUtil;

public class TestCRUDAnnotationMapper {

	@Test
	public void testAdd() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		// 获取 userMapperI 的实现类对象
		userMapperI userMapper = sqlSession.getMapper(userMapperI.class);
		User user = new User();
		user.setName("王小锤");
		user.setAge(1);
		int result = userMapper.add(user);
		sqlSession.close();
		System.out.println(result);
	}
	
	@Test
	public void testUpdate() {
		SqlSession sqSession = MyBatisUtil.geSqlSession(true);
		userMapperI userMapper = sqSession.getMapper(userMapperI.class);
		User user = new User();
		user.setId(5);
		user.setName("赵铁柱");
		user.setAge(31);
		int result = userMapper.update(user);
		sqSession.close();
		System.out.println(result);
	}
	
	@Test
	public void testDeleteById() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		userMapperI userMapper = sqlSession.getMapper(userMapperI.class);
		int result = userMapper.deleteById(6);
		sqlSession.close();
		System.out.println(result);
	}
	
	@Test
	public void testGetById() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		userMapperI userMapper = sqlSession.getMapper(userMapperI.class);
		User user = userMapper.getById(1);
		sqlSession.close();
		System.out.println(user);
	}
	
	@Test
	public void testGetAll() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		userMapperI userMapper = sqlSession.getMapper(userMapperI.class);
		List<User> userList = userMapper.getAll();
		sqlSession.close();
		System.out.println(userList);
	}
	
}
