package bankaccount“¯––’Àªß;

public class Account {
	private long id = 0;
	private double balance = 0;
	private String password = null;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//////////////
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

////////////////
	public String getPassword() {
		return null;
	}

	public void setPassword(String password) {
		if (password.length() == 6) {
			this.password = password;
		} else
			System.out.println("input error !");
	}

}
