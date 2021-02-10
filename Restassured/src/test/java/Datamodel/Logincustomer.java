package Datamodel;

import org.testng.annotations.Test;

import Pojo.Login;


public class Logincustomer {
	
	@Test
	public Login logs(String lemail,String lpassword) {
		
		
			Login log = new Login();
			log.setLemail("eve.holt@reqres.in");
			log.setLpassword("cityslicka");
			return log;
			
		}

}
/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */