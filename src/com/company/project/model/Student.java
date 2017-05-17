package com.company.project.model;

/**
 * @author tuzkimo
 * 定义表 student 对应的实体类
 */
public class Student {

	// 定义与表 student 字段一一对应的属性值
	private int id;		// id ==> s_id
	private String name;	// name ==> s_name
	private Class clazz;	// clazz ==> class_id
	
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
	public Class getClazz() {
		return clazz;
	}
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
