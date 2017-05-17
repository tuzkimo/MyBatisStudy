package com.company.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.company.project.model.User;

/**
 * @author tuzkimo
 * 定义 SQL 映射的接口，使用注解指明要执行的的 SQL
 */
public interface userMapperI {

	// 使用 @Insert 注解指明 add 方法要执行的 SQL
	@Insert("INSERT INTO user(name,age) VALUES(#{name},#{age})")
	public int add(User user);
	
	// 使用 @Delete 注解指明 deleteById 方法要执行的 SQL
	@Delete("DELETE FROM user WHERE id = #{id}")
	public int deleteById(int id);
	
	// 使用 @Update 注解指明 update 方法要执行的 SQL
	@Update("UPDATE user SET name = #{name}, age = #{age} WHERE id = #{id}")
	public int update(User user);
	
	// 使用 @Select 注解指明 getById 方法要执行的 SQL
	@Select("SELECT * FROM user WHERE id = #{id}")
	public User getById(int id);
	
	// 使用 @Select 注解指明 getAll 方法要执行的 SQL
	@Select("SELECT * FROM user")
	public List<User> getAll();
	
}
