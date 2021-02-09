package Utili;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PropertiesReader {

	RequestSpecification req;

	public RequestSpecification requestSpecification() throws IOException {

		RestAssured.baseURI = "https://reqres.in/";
		req = new RequestSpecBuilder().setBaseUri(getGlobalvalue("BaseURL")).setBasePath(getGlobalvalue("BasePATH"))
				.setContentType(ContentType.JSON).build();
		return req;
	}

	public String getGlobalvalue(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Automation\\Eclipse\\Restassured\\src\\test\\java\\Utili\\Global.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
		
		
		
				
	}
	
	
}
