package techproedturkish01.techproedturkish01api;

import static io.restassured.RestAssured.*;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest10 extends TestBase{
//	When I send GET Request to URL
//	 http://dummy.restapiexample.com/api/v1/employees
//	 Then
//	  Status code is 200
//	  1)10'dan buyuk tum id’leri console’a yazdir
//	  10'dan buyuk 14 tane id oldugunu verify et
//	  2)30'dan kucuk tum yaslari console’a yazdir
//	  30 dan kucuk en buyuk yasin 23 oldugunu verify et
//	  3)Maasi 350000'den cok olan iscilerin isimlerini console’a yazdir
//	  Charde Marshall’in maasinin 350000'den buyuk oldugunu verify et
	
	@Test
	public void get01() {
		Response response = given().
								spec(spec02).
							when().
								get();
	response.prettyPrint();
	
//	  Status code is 200
	response.
		then().
		assertThat().
		statusCode(200);
	JsonPath json = response.jsonPath();
	SoftAssert softAssert = new SoftAssert();
	
//	1)10'dan buyuk tum id’leri console’a yazdir
		List<String> idList = json.getList("data.findAll{Integer.valueOf(it.id)>10}.id");
		System.out.println(idList);
		
//	10'dan buyuk 14 tane id oldugunu verify et
		softAssert.assertEquals(idList.size(),14,  "Eleman sayisi istenen gibi degil");
		
		
//	2)30'dan kucuk tum yaslari console’a yazdir
		List<String> yasList = json.getList("data.findAll{Integer.valueOf(it.employee_age)<30}.employee_age");
		System.out.println(yasList);
		
//	30 dan kucuk en buyuk yasin 23 oldugunu verify et
		Collections.sort(yasList);
		softAssert.assertTrue(yasList.get(yasList.size()-1).equals("23"),  "Yas istenen gibi degil");
		
//	3)Maasi 350000'den cok olan iscilerin isimlerini console’a yazdir
		List<String> salaryList = json.getList("data.findAll{Integer.valueOf(it.employee_salary)>350000}.employee_name");
		System.out.println(salaryList);
//	Charde Marshall’in maasinin 350000'den buyuk oldugunu verify et
		softAssert.assertTrue(salaryList.contains("Charde Marshall"), "Isim istenen gibi degil");
		softAssert.assertAll();
		
}
}
