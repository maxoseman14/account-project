package maven_archetype_quickstart.com.qa.accountapplication;

public class Account {
	
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	
	public Account(String firstName, String lastName, int accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber + "]";
	}




	public String getFirstName() {
		return firstName;
	}
	
	
	
	
}
