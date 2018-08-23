package maven_archetype_quickstart.com.qa.accountapplication;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Service {
	
	private Map<Integer, Account>accountMap;
	
	private Gson gson;
	
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
	
	public Account getAccountFromMap (int accountToGet)
	{
		return accountMap.get(accountToGet);
	}
	
	public String convertMapToJson () 
	{
		gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(accountMap); 
	
	}

}
