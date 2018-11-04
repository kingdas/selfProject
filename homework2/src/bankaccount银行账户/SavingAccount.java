package bankaccountÒøĞĞÕË»§;

public class SavingAccount extends Account {
	public SavingAccount(long id, double balance, String password, double line) {
		super.setId(id);
		super.setBalance(balance);
		super.setPassword(password);
		setInterestRate(line);
	}
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		if (interestRate > 0 && interestRate < 0.1) {
			this.interestRate = interestRate;
		}
		else
			System.out.println("input error !");
	}

}
