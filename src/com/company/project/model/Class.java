package com.company.project.model;

import java.util.List;

/**
 * @author tuzkimo
 * 定义与表 class 对应的实体类
 */
public class Class {

	// 定义与表 class 字段一一对应的属性
	private int id;		// id ==> c_id
	private String name;	// name ==> c_name
	private Teacher teacher;	// teacher ==> teacher_id, 用于维护表 teacher 与表 class 之间一一对应的关系
	private List<Student> students;		// 用于维护表 class 与表 student 之间一对多关系
	
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher + ", students=" + students + "]";
	}
	
}
