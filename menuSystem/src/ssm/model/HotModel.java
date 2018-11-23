package ssm.model;

public class HotModel {
	private Integer id;
	private String name;
	private String price;
	private String remark;

	public HotModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotModel(Integer id, String name, String price, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.remark = remark;
	}

	public HotModel(String name, String price, String remark) {
		super();
		this.name = name;
		this.price = price;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "HotModel [id=" + id + ", name=" + name + ", price=" + price + ", remark=" + remark + "]";
	}

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
