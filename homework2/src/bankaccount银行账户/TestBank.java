package bankaccountÒøĞĞÕË»§;

public class TestBank {
	public static void main(String[] args) {
		Account a = new SavingAccount(12345, 10000, "121212", 0.05);
		System.out.println(a.getId() + " " + a.getBalance() + " " + a.getPassword() + " "
		+((SavingAccount)a).getInterestRate());
	}
}
