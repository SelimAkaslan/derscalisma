package techproedturkish01.techproedturkish01api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequest09 extends TestBase{
	
	@Test
	public void get01() {
		Response response = given().
								spec(spec02).
							when().
								get();
		response.prettyPrint();
		// jseonpath objesi olusturun
		JsonPath json = response.jsonPath();
		// Tum eployee isimlerini yazdirin
		System.out.println(json.getList("data.employee_name"));
		
		// Ikinci iscinin isminin Garret Winders oldugunu verfy (soft assertion) ediniz
		// data bir list oldugundan istenen elemana index ile ulasiriz
		
		// Hard essertion ile yaptik halbuki soruda verfy (soft assertion) diyor. Bu yuzden soft asserion kullanmaliyiz
		assertEquals("Employee name ayni degil", "Garrett Winters", json.getString("data[1].employee_name"));
		
		// Soft assertion icin 3 adim takip eilmelidir.
		// 1. SoftAssert class indan obje(softAssert) olusturmaliyiz
		// 2. Objeyi (softAssert) kullanarak assertion etmeliyiz
		// 3. softAssert.assertAll(); yapmaliyiz
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(json.getString("data[1].employee_name"), "Garrett Winters", "Isim istenen gibi degil");
		// softAssert.assertAll(); ==> en son sorguya eklemek daha iyi
		
		// Iscilerin arasinda  Herrod Chandler var mi kontrol ediniz
		softAssert.assertTrue(json.getList("data.employee_name").contains("Herrod Chandler"), "Herrod Chandler yok");
		
		// 24 tane isci oldugunu verfy ediniz
		softAssert.assertEquals(json.getList("data.id").size(),24,  "24 isci yok");
		
		// 7. iscinin maasinin 137500 oldugunu verfy ediniz
		softAssert.assertEquals(json.getString("data[6].employee_salary"),"137500",  "Maas istenen gibi degil");
		softAssert.assertAll();
	}

}
