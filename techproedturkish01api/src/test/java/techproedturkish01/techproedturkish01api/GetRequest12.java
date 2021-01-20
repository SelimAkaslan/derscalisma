package techproedturkish01.techproedturkish01api;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import com.google.gson.Gson;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GetRequest12 extends TestBase {
	
//	GSON : 1) Json formatindaki datalari Java Objectlerine donusturu(De-Serialization)
//	2) Java Objectlerini Json formatindaki datalara donusturur.(Serialization)
//  NOT ; GSON ile ayni isi yapan ObjectMapper class da vardir
	@Test
	public void get01() {
		Response response = given().
								spec(spec03).
							when().
								get();
		response.prettyPrint();
		
		//Json formatindaki datalari Java Objectlerine donusturme ==>De-Serialization
		List<Map<String, Object>> listOfMaps = response.as(ArrayList.class);
		
		System.out.println(listOfMaps);
		System.out.println(listOfMaps.get(0));
		
		// 200 tane id oldugunu verify ediniz
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(listOfMaps.size()==200,"id sayisi istenen gibi degil");
		softAssert.assertAll();
		
		// 121. elemanin completed degerinin true oldugunu verfy ediniz
		softAssert.assertEquals(listOfMaps.get(121).get("completed"),true, "Istenen gibi degil");
		softAssert.assertAll();
		
		// Sondan bir onceki elemanin tatlinin "numquam repellendus a magnam" oldugunu verify ediniz
		softAssert.assertEquals(listOfMaps.get(listOfMaps.size()-2).get("title"),"numquam repellendus a magnam", "Istenen gibi degil");
		softAssert.assertAll();
		
		// Java Objectlerini Json formatindaki datalara donusturme. ==>Serialization
		
		Gson gson = new Gson();
		String jsonFromList = gson.toJson(listOfMaps);
		System.out.println(jsonFromList);
		
		
		
		
	}

}
