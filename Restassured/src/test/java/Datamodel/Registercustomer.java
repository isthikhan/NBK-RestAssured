package Datamodel;

import org.testng.annotations.Test;

import Pojo.Register;

public class Registercustomer {
	
	@Test
	public Register Regcustomer(String email,String password) {
		
		
			Register Reg = new Register();
			Reg.setEmail("eve.holt@reqres.in");
			Reg.setPassword("pistol");
			return Reg;
			
		}
	}

/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */