package maven_archetype_quickstart.com.qa.accountapplication;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer, Account> accountMap;
	
	private int counter;
	
	public Service () 
	{
		accountMap = new HashMap<Integer, Account>();
		counter = 1;
	}
	
	public void addAccountToMap(Account accountToAdd)
	{
		accountMap.put(counter, accountToAdd);
		counter++;
	}
	
	public Account getAccountFromMap (Integer accountToGet)
	{
		return accountMap.get(accountToGet);
	}

}
