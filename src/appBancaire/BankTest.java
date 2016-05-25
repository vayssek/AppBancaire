package appBancaire;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

	private Bank bank;
	private Customer customer;
	private Account account;
	
	
	@Before
	public void setup() {
	// Initialization of test parameters
		bank = new Bank();
		customer = new Customer("Kevin","VAYSSE");
		account = new Account("123456789",0);
	}
	
	@Test
	public void returnListCustomers(){
		//GIVEN
		//WHEN
		List<Customer> result = bank.getCustomers();
		//THEN
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void returnListCustomersAdded(){
		//GIVEN
		bank.getCustomers().add(customer);
		//WHEN
		List<Customer> result = bank.getCustomers();
		//THEN
		assertFalse(result.isEmpty());
	}
	
	@Test
	public void returnListAccounts(){
		//GIVEN
		bank.getCustomers();
		//WHEN
		List<Account> result = bank.getAccounts();
		//THEN
		assertTrue(result.isEmpty());
	}
	
	
}
