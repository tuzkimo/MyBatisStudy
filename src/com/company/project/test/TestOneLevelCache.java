package com.company.project.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.company.project.model.User;
import com.company.project.util.MyBatisUtil;

/**
 * @author tuzkimo
 * 测试一级缓存
 */
public class TestOneLevelCache {

	/*
	 * 一级缓存就是 session 级缓存，默认开启
	 */
	@Test
	public void testCache1() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.userMapper.getUser";
		User user = sqlSession.selectOne(statement, 1);
		System.out.println(user);
		
		/*
		 * 一级缓存默认就会被使用
		 */
		user = sqlSession.selectOne(statement, 1);
		System.out.println(user);
		sqlSession.close();
		
		/*
		 * 必须是同一个 session, 如 session 已经被 close() 就不能再用了
		 */
		sqlSession = MyBatisUtil.getSqlSession();
		user = sqlSession.selectOne(statement, 1);
		System.out.println(user);
		
		/*
		 * 查询条件一样，传参不一样也可调用一级缓存
		 */
		user = sqlSession.selectOne(statement, 2);
		System.out.println(user);
		
		/*
		 * 手动调用 clearCache() 可清理缓存
		 */
		sqlSession.clearCache();
		user = sqlSession.selectOne(statement, 2);
		System.out.println(user);
		
		/*
		 * 执行增删改操作也会清理缓存
		 */
		user.setId(2);
		user.setName("尼美");
		user.setAge(1);
		sqlSession.update("com.company.project.mapper.userMapper.updateUser", user);
		user = sqlSession.selectOne(statement, 2);
		System.out.println(user);
	}
}
