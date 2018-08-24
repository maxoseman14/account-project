package maven_archetype_quickstart.com.qa.accountapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class AccountAppTest extends Object {
	
	private Service service;

	@Before
	public void setUp() throws Exception {
	
		service = new Service();
		Account tony = new Account("Tony", "Glover", 345);
		service.addAccountToMap(tony);
		Account bob = new Account("Bob", "Smith", 456);
		service.addAccountToMap(bob);
		Account bob2 = new Account("Bob", "John", 457);
		service.addAccountToMap(bob2);
		
	}
	
	@Test
	public void getAccountsByName () {
		
		assertEquals(2, service.getNumberAccountsByName("Bob"));
	
	}
	

}
