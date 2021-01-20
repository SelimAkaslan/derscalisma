package techproedturkish01.techproedturkish01api;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRequest01 extends TestBase{
	/* 
	 Post Request olusturmak icin gerekenler:
	   1)EndPoint sart
	   2)Request body sart
	   3)Authorization sart
	   4)Accept Type istege baglidir bazen kullanilir bazan kullanilmaz
	   5)Content Type istege baglidir bazen kullanilir bazan kullanilmaz
	    
	GET ile POST Request’lerin farklari nedir? 
	1)GET Request olusturmak icin sadece Endpoint yeterlidir, ama POST Request olusturmak icin Endpoint yaninda 
	 Request body de gerekir. 
	2)GET data cekmek icin, POST yeni data olusturmak icin kullanilir.  
	
	NOTE: API Developer’lar oluturulacak data’nin bazi bolumlerinin bos birakilmamasina karar vermislerse
	   POST Request olustururken kesinlikle o kisimlara deger verilerek POST Request olusturulmalidir. Eger buna dikkat
	   etmezseniz ‘400 Bad Request’ status code alirsiniz  
	    
	NOTE: API Developer’lar oluturulacak data’nin bazi bolumlerinin tekrarli olmamasina karar vermislerse
	   POST Request olustururken o kisimlara tekrarli degerler verilerek POST Request olusturulmamalidir. Eger buna dikkat
	   etmezseniz ‘400 Bad Request’ status code alirsiniz
	 */
	
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
	
	// 1. Way : Iyi degil
	@Test
	public void post01() {
	
	String jsonRequestBody = "{\n" + 
								"\"firstname\": \"Selim\",\n" + 
								"\"lastname\": \"Akaslan\",\n" + 
								"\"totalprice\": 103,\n" + 
								"\"depositpaid\": true,\n" + 
								"\"bookingdates\": {\n" + 
								"\"checkin\": \"2020-05-05\",\n" + 
								"\"checkout\": \"2020-07-07\"\n" + 
								"},\n" + 
								"\"additionalneeds\": \"Wifi\"\n" + 
								"}";
	Response response = given().
			contentType(ContentType.JSON).//contentType : Icerik tipi, DataBase'e yolladigim data'nin icerik tipi JSON
            //              post'da given'dan sonra contentType(ContentType.JSON) kullan
							spec(spec01).
							auth().
							basic("admin", "password123").
							body(jsonRequestBody).
							when().
							post("/booking");
	response.prettyPrint();
	response.
	then().
	assertThat().
	statusCode(200);
	
	// json path kullanarak assertion yapalim
	JsonPath json = response.jsonPath();
	// firstname assertion
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(json.getString("booking.firstname"), "Selim");
	// lastname assertion
	softAssert.assertEquals(json.getString("booking.lastname"), "Akaslan");
	// totalprice assertion
	softAssert.assertEquals(json.getInt("booking.totalprice"),103);
	// depositpaid assertion
	softAssert.assertEquals(json.getBoolean("booking.depositpaid"),true);
	// checkin assertion
	softAssert.assertEquals(json.getString("booking.bookingdates.checkin"),"2020-05-05");
	// checkout assertion
	softAssert.assertEquals(json.getString("booking.bookingdates.checkout"),"2020-07-07");
	// additionalneeds assertion
	softAssert.assertEquals(json.getString("booking.additionalneeds"),"Wifi");	
	softAssert.assertAll();
	
	}

}
