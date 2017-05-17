package com.company.project.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.company.project.util.MyBatisUtil;

public class TestCallable {

	@Test
	public void testGetUserCount() {
		SqlSession sqlSession = MyBatisUtil.geSqlSession(true);
		String statement = "com.company.project.mapper.userMapper.getUserCount";
		Map<String, Integer> parameterMap = new HashMap<String, Integer>();
		parameterMap.put("sexId", 0);
		parameterMap.put("userCount", -1);
		sqlSession.selectOne(statement, parameterMap);
		Integer result = parameterMap.get("userCount");
		sqlSession.close();
		System.out.println(result);
	}
	
}
