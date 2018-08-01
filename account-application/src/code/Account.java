package code;

public class Account {
	private String firstName;
	private String lastName;
	private long accountNumber;
	
	public Account(String firstName, String lastName, long accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String outputAccountDetails() {
		return "Account holder: " + firstName + " " + lastName + ". Account number: " + accountNumber + ".";
	}
	
	

}
