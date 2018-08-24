package maven_archetype_quickstart.com.qa.accountapplication;

public class Account_Main {

	public static void main(String[] args) {
		
	Service service = new Service();
	Account max = new Account("Max", "Oseman", 123);
	Account seb = new Account("Seb", "Delaney", 124);
	Account bob = new Account("Bob", "Smith", 234);
	service.addAccountToMap(max);
	service.addAccountToMap(seb);
	service.addAccountToMap(bob);
	service.getAccountFromMap(1);
	
	System.out.println(service.getAccountFromMap(2).toString());
	System.out.println(service.convertMapToJson());
	System.out.println("The number of accounts with the name Bob = " + service.getNumberAccountsByName("Bob"));
				
	}

}
