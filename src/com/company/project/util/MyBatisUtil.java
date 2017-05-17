package com.company.project.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	/**
	 * 获取 {@link SqlSessionFactory}
	 * @return {@link SqlSessionFactory}
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		String resource = "conf.xml";
		InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
	
	/**
	 * 获取 {@link SqlSession}
	 * @return {@link SqlSession}
	 */
	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}
	
	/**
	 * 获取 {@link SqlSession}
	 * @param isAutoCommit
	 * 		  true 表示创建的 SqlSesion 对象在执行完 SQL 后会自动提交事务
	 * 		  false 表示创建的 SqlSesion 对象在执行完 SQL 后不会自动提交事务，需要手动调用 sqlSession.commit() 提交事务
	 * @return {@link SqlSession}
	 */
	public static SqlSession geSqlSession(Boolean isAutoCommit) {
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}
