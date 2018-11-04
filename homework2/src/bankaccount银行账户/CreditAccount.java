package bankaccountÒøĞĞÕË»§;

public class CreditAccount extends Account {
	public CreditAccount(long id, double balance, String password, double line) {
		super.setId(id);
		super.setBalance(balance);
		super.setPassword(password);
		setCreditLine(line);
	}

	private double creditLine;

	public double getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}

}
