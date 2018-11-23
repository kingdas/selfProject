package ssm.model;

public class OrderModel {
	private Integer id;
	private Integer menuId;
	private Integer menuKind;
	private Integer num;

	public OrderModel() {

	}

	public OrderModel(Integer id, Integer menuId, Integer menuKind, Integer num) {
		super();
		this.id = id;
		this.menuId = menuId;
		this.menuKind = menuKind;
		this.num = num;
	}

	public OrderModel(Integer menuId, Integer menuKind, Integer num) {
		super();
		this.menuId = menuId;
		this.menuKind = menuKind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "orderModel [id=" + id + ", menuId=" + menuId + ", menuKind=" + menuKind + ", num=" + num + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getMenuKind() {
		return menuKind;
	}

	public void setMenuKind(Integer menuKind) {
		this.menuKind = menuKind;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

}
