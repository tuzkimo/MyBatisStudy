package com.company.project.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.company.project.model.User;
import com.company.project.util.MyBatisUtil;

/**
 * @author tuzkimo
 * 测试二级缓存
 */
public class TestTwoLevelCache {

	@Test
	public void testCache2() {
		String statement = "com.company.project.mapper.userMapper.getUser";
		SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
		// 开启两个不同的 sqlSession
		SqlSession sqlSession1 = sqlSessionFactory.openSession();
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		// 使用二级缓存，POJO 需要实现 Serializable 接口
		User user = sqlSession1.selectOne(statement, 1);
		// 提交事务后二级缓存才气作用
		sqlSession1.commit();
		System.out.println("User1：" + user);
		
		// 不同的 sqlSession 保证一级缓存不起作用
		user = sqlSession2.selectOne(statement, 1);
		System.out.println("User2：" + user);
		
	}
}
