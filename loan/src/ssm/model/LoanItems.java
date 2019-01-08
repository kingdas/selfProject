package ssm.model;

public class LoanItems {
	private Integer id;
	private Integer employeeId;
	private String title;
	private String amount;
	private String applyDate;
	private Integer status;

	public LoanItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanItems(Integer id, Integer employeeId, String title, String amount, String applyDate, Integer status) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.title = title;
		this.amount = amount;
		this.applyDate = applyDate;
		this.status = status;
	}

	public LoanItems(String title, String amount) {
		super();
		this.title = title;
		this.amount = amount;
	}

	public LoanItems(Integer employeeId, String title, String amount, String applyDate, Integer status) {
		super();
		this.employeeId = employeeId;
		this.title = title;
		this.amount = amount;
		this.applyDate = applyDate;
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanItems [id=" + id + ", employeeId=" + employeeId + ", title=" + title + ", amount=" + amount
				+ ", applyDate=" + applyDate + ", status=" + status + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
