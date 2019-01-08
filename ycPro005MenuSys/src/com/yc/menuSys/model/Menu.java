package com.yc.menuSys.model;

public class Menu {

	private int id;// 菜的编号
	private String name;// 菜的名字
	private String pic;// 菜的照片,只存照片的相对地址
	private float price;// 菜的价格
	private String remark;// 备注
	private int num;// 份数--非持久化属性
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
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", pic=" + pic
				+ ", price=" + price + ", remark=" + remark + ", num=" + num
				+ "]";
	}
	public Menu(int id, String name, String pic, float price, String remark,
			int num) {
		super();
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.price = price;
		this.remark = remark;
		this.num = num;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String name, String pic, float price, String remark, int num) {
		super();
		this.name = name;
		this.pic = pic;
		this.price = price;
		this.remark = remark;
		this.num = num;
	}
	
	
	
	

}
