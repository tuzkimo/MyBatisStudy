package com.company.project.test;

import java.io.IOException;
import java.io.InputStream;
//import java.io.Reader;

//import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.company.project.model.User;

public class Test {
	public static void main(String[] args) throws IOException {
		// 获取 MyBatis 配置文件路径
		String resource = "conf.xml";
		// 使用类加载器加载 MyBatis 配置文件（同时加载映射文件）
		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
		// 构建 SqlSession 工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		// 使用 Mybatis 提供的 Resources 类加载配置文件
		// Reader reader = Resources.getResourceAsReader(resource);
		// 构建 SqlSession 工厂
		// SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		// 创建 SqlSession
		SqlSession sqlSession = sessionFactory.openSession();
		// 映射 Sql 的标识字符串
		String statement = "com.company.project.mapper.userMapper.getUser";
		// 执行查询返回一个唯一 User 对象
		User user = sqlSession.selectOne(statement, 1);
		System.out.println(user);
	}
}
