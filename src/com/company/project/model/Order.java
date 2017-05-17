package com.company.project.model;
/**
 * @author tuzkimo
 * 定义 orders 表对应的实体类
 */
public class Order {
	/**
	 * CREATE TABLE orders (
	 * 	   order_id INT PRIMARY KEY AUTO_INCREMENT,
	 * 	   order_no VARCHAR(20),
	 *     order_price FLOAT
	 * );
	 */
	
	// 实体类属性名与 orders 表中的字段名不一致
	private int id;		// id ==> order_id
	private String orderNo;		// orderNo ==> order_no
	private float price;		// price ==> order_price
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order [id=" + id + ", orderNo=" + orderNo + ", price=" + price + "]";
	}
	
}
