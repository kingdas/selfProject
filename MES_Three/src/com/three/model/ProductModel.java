package com.three.model;

/**
 * 产品类
 * 
 * @author Administrator
 * 
 */
public class ProductModel {
	private int itemId;// 产品ID
	private String itemCode;// 产品编码
	private String description;// 产品描述
	private String crustSource;// 来源
	private String program;// 程序
	private String oem;// 品牌
	private String carModel;// 车型
	private String component;// 组件
	private String hideRatio;// 覆盖率
	private String scrap;// 报废率

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCrustSource() {
		return crustSource;
	}

	public void setCrustSource(String crustSource) {
		this.crustSource = crustSource;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getOem() {
		return oem;
	}

	public void setOem(String oem) {
		this.oem = oem;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getHideRatio() {
		return hideRatio;
	}

	public void setHideRatio(String hideRatio) {
		this.hideRatio = hideRatio;
	}

	public String getScrap() {
		return scrap;
	}

	public void setScrap(String scrap) {
		this.scrap = scrap;
	}

	public ProductModel() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public ProductModel(String itemCode, String description,
			String crustSource, String program, String oem, String carModel,
			String component, String hideRatio, String scrap) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.crustSource = crustSource;
		this.program = program;
		this.oem = oem;
		this.carModel = carModel;
		this.component = component;
		this.hideRatio = hideRatio;
		this.scrap = scrap;
	}

	public ProductModel(int itemId, String itemCode, String description,
			String crustSource, String program, String oem, String carModel,
			String component, String hideRatio, String scrap) {
		super();
		this.itemId = itemId;
		this.itemCode = itemCode;
		this.description = description;
		this.crustSource = crustSource;
		this.program = program;
		this.oem = oem;
		this.carModel = carModel;
		this.component = component;
		this.hideRatio = hideRatio;
		this.scrap = scrap;
	}
}
