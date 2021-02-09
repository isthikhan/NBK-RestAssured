package Datamodel;

import org.testng.annotations.Test;

import Pojo.Register;

public class Registercustomer {
	
	@Test
	public Register Regcustomer(String email,String password) {
		
		
			Register Reg = new Register();
			Reg.setEmail(email);
			Reg.setPassword(password);
			return Reg;
			
		}
	}

