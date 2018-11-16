package com.five.model;

public class SysItemModel {
	private Integer itemId; //��ƷID
	private String itemCode;  //��Ʒ����
	private String description;  //��Ʒ����
	private String crustSource;   //��Դ
	private String program;     //����
	private String oem;     //Ʒ��
	private String carModel;   //����
	private String component;  //���
	private String hideRatio;   //������
	private String scrap;    //������
	
	public SysItemModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SysItemModel(Integer itemId, String itemCode, String description,
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

	public SysItemModel(String itemCode, String description,
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

	@Override
	public String toString() {
		return "SysItemModel [itemId=" + itemId + ", itemCode=" + itemCode
				+ ", description=" + description + ", crustSource="
				+ crustSource + ", program=" + program + ", oem=" + oem
				+ ", carModel=" + carModel + ", component=" + component
				+ ", hideRatio=" + hideRatio + ", scrap=" + scrap + "]";
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
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


	
}
