package com.five.model;

public class RoleModel {
private Integer id;
private String name;
private String miaosu;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMiaosu() {
	return miaosu;
}
public void setMiaosu(String miaosu) {
	this.miaosu = miaosu;
}
@Override
public String toString() {
	return "Model [id=" + id + ", name=" + name + ", miaosu=" + miaosu + "]";
}
public RoleModel(Integer id, String name, String miaosu) {
	super();
	this.id = id;
	this.name = name;
	this.miaosu = miaosu;
}
public RoleModel() {
	super();
	// TODO Auto-generated constructor stub
}
public RoleModel(String name, String miaosu) {
	super();
	this.name = name;
	this.miaosu = miaosu;
}
public static void main(String[] args) {

}

}
