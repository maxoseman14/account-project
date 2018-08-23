package maven_archetype_quickstart.com.qa.accountapplication;

public class Account_Main {

	public static void main(String[] args) {
		
	Service service = new Service();
	Account max = new Account("Max", "Oseman", 123);
	Account seb = new Account("Seb", "Delaney", 124);
	service.addAccountToMap(max);
	service.addAccountToMap(seb);
	service.getAccountFromMap(1);
	System.out.println(service.getAccountFromMap(2).toString());
	System.out.println(service.convertMapToJson());

	
	
				
	}

}
