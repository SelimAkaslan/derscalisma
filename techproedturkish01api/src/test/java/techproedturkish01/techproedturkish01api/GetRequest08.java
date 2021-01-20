package techproedturkish01.techproedturkish01api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequest08 extends TestBase {
//	 When I send a GET request to REST API URL
//	 https://restful-booker.herokuapp.com/booking/5
//	 Then HTTP Status Code should be 200
//	 And response content type is “application/JSON”
//	 And response body should be like;
//	 {
//	“firstname”: “Sally”, 
//	“lastname”: “Ericsson”, 
//	“totalprice”: 111,
//	“depositpaid”: false, 
//	“bookingdates”: { 
//								“checkin”: “2017-05-23","
//								 “checkout”:“2019-07-02" }
	
	@Test
	public void get01() {
		spec01.pathParam("bookingid", 5);
		Response response = given().
								spec(spec01).
							when().
								get("/booking/{bookingid}");
		
		response.prettyPrint();
		
		// JSON formatindaki data'larin icinde gezmemizi kolaylastirir
		JsonPath json = response.jsonPath();
		
		System.out.println(json.getString("firstname"));
			assertEquals("Firstname istenilan gibi degil", "Jim", json.getString("firstname"));
			
		System.out.println(json.getString("lastname"));
			assertEquals("Lastname istenilen gibi degil", "Jones", json.getString("lastname"));
			
		System.out.println(json.getInt("totalprice"));
			assertEquals("Totalprice istenilen gibi degil", 596, json.getInt("totalprice"));
			
		System.out.println(json.getBoolean("depositpaid"));
		assertEquals("Depositpaid istenilen gibi degil", true, json.getBoolean("depositpaid"));
		
		System.out.println(json.getString("bookingdates.checkin"));
		assertEquals("Bookingdates.checkin istenilen gibi degil", "2019-07-20", json.getString("bookingdates.checkin"));
		
		System.out.println(json.getString("bookingdates.checkout"));
		assertEquals("Bookingdates.checkout istenilen gibi degil", "2019-11-17", json.getString("bookingdates.checkout"));
		
	}

}
