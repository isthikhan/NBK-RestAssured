package APIs;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Headers;
import Datamodel.Createcustomer;
import Datamodel.Logincustomer;
import Utili.PropertiesReader;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class userLoginPOST extends PropertiesReader {

	@Test
	public void LoginUserPOST() throws IOException {
		RequestSpecification res;
		ResponseSpecification resspec;
		Response response;
		Logincustomer data = new Logincustomer();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();

		res = given().log().all().spec(requestSpecification()).headers(head.UserLoginHeaders())
				.body(data.logs("lemail", "lpassword"));

		resspec = new ResponseSpecBuilder().expectStatusCode(400).expectContentType(ContentType.JSON).build();
		response = res.when().post(Global.getGlobalvalue("loginuser")).then().log().all().spec(resspec).extract()
				.response();

		assertEquals(response.getStatusCode(), 400);

	}
}
