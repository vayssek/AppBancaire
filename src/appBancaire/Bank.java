package appBancaire;

import java.util.List;

class Bank {
	
	private List<Customer> customerList;
	private List<Account> accountList;
	
	public Bank(){
		
	}
	
	public List<Customer> getCustomers(){
		return customerList;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

}
