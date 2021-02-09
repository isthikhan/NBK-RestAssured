package APIs;

import static io.restassured.RestAssured.*;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Datamodel.*;
import Common.*;
import Utili.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class userCreationPOST extends PropertiesReader{
	
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	Createcustomer data = new Createcustomer();
	PropertiesReader Global = new PropertiesReader();
	Headers head = new Headers();
	
	@Test
	public void two(String name, String Job) throws IOException {

		res = given().log().all().spec(requestSpecification()).headers(head.UserCreationHeaders())
				.body(data.ccustomerdata(name, Job));

		resspec = new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		response = res.when().post(Global.getGlobalvalue("Createuser")).then().log().all().spec(resspec).extract()
				.response();

		assertEquals(response.getStatusCode(), 201);

	}}

