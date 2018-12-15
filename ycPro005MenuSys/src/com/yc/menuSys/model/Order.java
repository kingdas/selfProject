package com.yc.menuSys.model;

import java.util.Date;

public class Order {

	// id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '�����ı��',
	// tableNum varchar(10) DEFAULT NULL COMMENT '����',
	// createTime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '�µ�ʱ��',
	// personCount int(11) DEFAULT 0 COMMENT '�ò�����',
	// totalPrice double DEFAULT 0 COMMENT 'Ӧ�ռ۸�',
	// realPrice double DEFAULT 0 COMMENT 'ʵ�ռ۸�',
	// isPayment bit(1) DEFAULT 0 comment '�Ƿ���ˣ�0��δ�򵥣�1������',
	// paymentTime datetime comment '����ʱ��',
	// remark varchar(100) DEFAULT NULL COMMENT '��ע'

	private int id;
	private String tableNum;
	private Date createTime;
	private int personCount;
	private double totalPrice;
	private double realPrice;
	private boolean isPayment;
	private Date paymentTime;
	private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTableNum() {
		return tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getPersonCount() {
		return personCount;
	}
	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getRealPrice() {
		return realPrice;
	}
	public void setRealPrice(double realPrice) {
		this.realPrice = realPrice;
	}
	public boolean isPayment() {
		return isPayment;
	}
	public void setPayment(boolean isPayment) {
		this.isPayment = isPayment;
	}
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", tableNum=" + tableNum + ", createTime="
				+ createTime + ", personCount=" + personCount + ", totalPrice="
				+ totalPrice + ", realPrice=" + realPrice + ", isPayment="
				+ isPayment + ", paymentTime=" + paymentTime + ", remark="
				+ remark + "]";
	}
	public Order(int id, String tableNum, Date createTime, int personCount,
			double totalPrice, double realPrice, boolean isPayment,
			Date paymentTime, String remark) {
		super();
		this.id = id;
		this.tableNum = tableNum;
		this.createTime = createTime;
		this.personCount = personCount;
		this.totalPrice = totalPrice;
		this.realPrice = realPrice;
		this.isPayment = isPayment;
		this.paymentTime = paymentTime;
		this.remark = remark;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String tableNum, Date createTime, int personCount,
			double totalPrice, double realPrice, boolean isPayment,
			Date paymentTime, String remark) {
		super();
		this.tableNum = tableNum;
		this.createTime = createTime;
		this.personCount = personCount;
		this.totalPrice = totalPrice;
		this.realPrice = realPrice;
		this.isPayment = isPayment;
		this.paymentTime = paymentTime;
		this.remark = remark;
	}
	
	

}
