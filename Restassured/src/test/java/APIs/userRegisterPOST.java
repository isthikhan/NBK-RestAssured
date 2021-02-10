package APIs;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Headers;
import Datamodel.Createcustomer;
import Datamodel.Registercustomer;
import Utili.PropertiesReader;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class userRegisterPOST extends PropertiesReader {

		@Test
		public void RegisteruserPOST() throws IOException {
			RequestSpecification res;
			ResponseSpecification resspec;
			Response response;
			Registercustomer data = new Registercustomer();
			PropertiesReader Global = new PropertiesReader();
			Headers head = new Headers();

			res = given().log().all().spec(requestSpecification()).headers(head.UserRegisterHeaders())
					.body(data.Regcustomer("email", "password"));

			resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
			response = res.when().post(Global.getGlobalvalue("registeruser")).then().log().all().spec(resspec).extract()
					.response();

			assertEquals(response.getStatusCode(), 200);

		}
	}


