package appBancaire;

import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTest {
	@Test
	public void findFirstName(){
		//GIVEN
		Customer customer = new Customer("Kevin","VAYSSE");
		//WHEN
		String result = customer.getFirstName();
		//THEN
		assertEquals(result,"Kevin");
	}
}
