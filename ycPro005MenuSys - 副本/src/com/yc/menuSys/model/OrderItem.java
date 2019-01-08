package com.yc.menuSys.model;

public class OrderItem {
	// id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '���',
	// orderId int(11) DEFAULT NULL COMMENT '������',
	// menuId int(11) DEFAULT NULL COMMENT '�˵���',
	// num int(11) DEFAULT 1 COMMENT '����',

	private int id;
	private int orderId;
	private int menuId;
	private int num;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", menuId="
				+ menuId + ", num=" + num + "]";
	}

	public OrderItem(int id, int orderId, int menuId, int num) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.menuId = menuId;
		this.num = num;
	}

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItem(int orderId, int menuId, int num) {
		super();
		this.orderId = orderId;
		this.menuId = menuId;
		this.num = num;
	}

}
