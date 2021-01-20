package techproedturkish01.techproedturkish01api;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class PostRequest03 extends TestBase{
					/*
					POST Scenario:
					Accept type Json olsun(Content Type demektir)
					When 
					POST request yolladigimda
					1) https://restful-booker.herokuapp.com/booking
					2) Request Body 
					
					{
					"firstname": "Selim",
					"lastname": "Akaslan",
					"totalprice": 103,
					"depositpaid": true,
					"bookingdates": {
					   "checkin": "2020-05-05",
					   "checkout": "2020-07-07"
					},
					"additionalneeds": "Wifi"
					}
					Then 
					Status Code 200 olmali
					Response Body'nin, Request Body ile ayni oldugunu verify ediniz.
					
					*/
	@Test
	public void post01() {
//		Map <String, String> bookingDatesMap = new HashMap<>();
//		bookingDatesMap.put("checkin", "2020-05-05");
//		bookingDatesMap.put("checkout", "2020-07-07");
//		
//		Map<String, Object> requestBodyMap = new HashMap<>();
//		requestBodyMap.put("firstname", "Selim");
//		requestBodyMap.put("lastname", "Akaslan");
//		requestBodyMap.put("totalprice", 103);
//		requestBodyMap.put("depositpaid", true);
//		requestBodyMap.put("bookingdates", bookingDatesMap);
//		requestBodyMap.put("additionalneeds", "Wifi");
//		
//		Response response = given().
//				contentType(ContentType.JSON).//contentType : Icerik tipi, DataBase'e yolladigim data'nin icerik tipi JSON
//	            							 //              post'da given'dan sonra contentType(ContentType.JSON) kullan
//								spec(spec01).
//								auth().
//								basic("admin", "password123").
//								body(requestBodyMap).
//								when().
//								post("/booking");  // TESTBASE E ATTIK
		Response response = createRequestBodyByMap();
		response.prettyPrint();
		response.
		then().
		assertThat().
		statusCode(200);
		
		//JsonPath kullanarak assertion yapalim
				JsonPath json = response.jsonPath();
				SoftAssert softAssert = new SoftAssert();
				
				//firstname assertion
				softAssert.assertEquals(json.getString("booking.firstname"), requestBodyMap.get("firstname"));
				
				//lastname assertion
				softAssert.assertEquals(json.getString("booking.lastname"), requestBodyMap.get("lastname"));
				
				//totalprice assertion
				softAssert.assertEquals(json.getInt("booking.totalprice"), requestBodyMap.get("totalprice"));
				
				//depositpaid assertion
				softAssert.assertEquals(json.getBoolean("booking.depositpaid"), requestBodyMap.get("depositpaid"));
				
				//checkin assertion
				softAssert.assertEquals(json.getString("booking.bookingdates.checkin"), bookingDatesMap.get("checkin"));
				
				//checkout assertion
				softAssert.assertEquals(json.getString("booking.bookingdates.checkout"), bookingDatesMap.get("checkout"));
				
				//additionalneeds assertion
				softAssert.assertEquals(json.getString("booking.additionalneeds"), requestBodyMap.get("additionalneeds"));
				
				softAssert.assertAll();
	}
	
}
