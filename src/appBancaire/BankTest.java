package appBancaire;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BankTest {

	@Test
	public void returnListCustomers(){
		//GIVEN
		//List<Customer> customerList = new ArrayList<Customer>();
		Bank bank = new Bank();
		//Customer customer = new Customer("Kevin","VAYSSE");
		//WHEN
		List<Customer> result = bank.getCustomers();
		//THEN
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void returnListCustomersAdd(){
		//GIVEN
		//List<Customer> customerList = new ArrayList<Customer>();
		Bank bank = new Bank();
		Customer customer = new Customer("Kevin","VAYSSE");
		bank.getCustomers().add(customer);
		//WHEN
		List<Customer> result = bank.getCustomers();
		//THEN
		assertFalse(result.isEmpty());
	}
	
}
