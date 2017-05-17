package com.company.project.model;

/**
 * @author tuzkimo
 * 定义与表 teacher 对应的实体类
 */
public class Teacher {

	// 定义与表 teacher 字段一一对应的属性
	private int id;		// id ==> t_id
	private String name;	// name ==> t_name
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
}
