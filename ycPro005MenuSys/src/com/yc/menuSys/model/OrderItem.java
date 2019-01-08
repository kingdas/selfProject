package com.yc.menuSys.model;

public class OrderItem {
	// id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '编号',
	// orderId int(11) DEFAULT NULL COMMENT '订单号',
	// menuId int(11) DEFAULT NULL COMMENT '菜单号',
	// num int(11) DEFAULT 1 COMMENT '份数',

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
