package techproedturkish01.techproedturkish01api;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest02 extends TestBase{
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
//		JSONObject jsonBookingDatesBody = new JSONObject();
//		jsonBookingDatesBody.put("checkin", "2020-05-05");
//		jsonBookingDatesBody.put("checkout", "2020-07-07");
//		
//		JSONObject jsonRequestBody = new JSONObject();
//		jsonRequestBody.put("firstname", "Selim");
//		jsonRequestBody.put("lastname", "Akaslan");
//		jsonRequestBody.put("totalprice", 103);
//		jsonRequestBody.put("depositpaid", true);
//		jsonRequestBody.put("bookingdates",jsonBookingDatesBody);
//		jsonRequestBody.put("additionalneeds", "Wifi");
//		
//		Response response = given().contentType(ContentType.JSON).
//				spec(spec01).
//				auth().
//				basic("admin", "password123").
//				body(jsonRequestBody.toString()).
//				when().
//				post("/booking");   //BU KISMI TESTBASE E TASIYARAK DINAMIK HALE GETIRDIK.
		
		Response response = createRequestBodyByJsonObjectClass();
		response.prettyPrint();
		response.
		then().
		assertThat().
		statusCode(200);
		
		// json path kullanarak assertion yapalim
		JsonPath json = response.jsonPath();
		// firstname assertion
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(json.getString("booking.firstname"), jsonRequestBody.getString("firstname"));
		// lastname assertion
		softAssert.assertEquals(json.getString("booking.lastname"), jsonRequestBody.getString("lastname"));
		// totalprice assertion
		softAssert.assertEquals(json.getInt("booking.totalprice"), jsonRequestBody.getInt("totalprice"));
		// depositpaid assertion
		softAssert.assertEquals(json.getBoolean("booking.depositpaid"), jsonRequestBody.getBoolean("depositpaid"));
		// checkin assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkin"), jsonBookingDatesBody.getString("checkin"));
		// checkout assertion
		softAssert.assertEquals(json.getString("booking.bookingdates.checkout"), jsonBookingDatesBody.getString("checkout"));
		// additionalneeds assertion
		softAssert.assertEquals(json.getString("booking.additionalneeds"), jsonRequestBody.getString("additionalneeds"));	
		softAssert.assertAll();

	}

}
