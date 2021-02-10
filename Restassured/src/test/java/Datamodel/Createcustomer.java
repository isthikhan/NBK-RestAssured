package Datamodel;

import org.testng.annotations.Test;

import Pojo.Customer;

public class Createcustomer {

	@Test
	public Customer ccustomerdata(String name,String Job) {
	
	
		Customer ccustomer = new Customer();
		ccustomer.setName("morpheus");
		ccustomer.setJob("leader");
		return ccustomer;
	}

}

/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */