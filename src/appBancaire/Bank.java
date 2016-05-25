package appBancaire;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Customer> customerList;
	private List<Account> accountList;
	
	public Bank(){
		this.customerList = new ArrayList<Customer>();
		this.accountList = new ArrayList<Account>();
	}
	
	public List<Customer> getCustomers(){
		return customerList;
	}

	public List<Account> getAccounts() {
		return accountList;
	}

}
