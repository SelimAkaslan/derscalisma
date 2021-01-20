package techproedturkish01.techproedturkish01api;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import com.google.gson.Gson;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;


public class GetRequest11 extends TestBase{
//	GSON : 1) Json formatindaki datalari Java Objectlerine donusturu(De-Serialization)
//			2) Java Objectlerini Json formatindaki datalara donusturur.(Serialization)
//	NOT ; GSON ile ayni isi yapan ObjectMapper class da vardir
	
	@Test
	public void get01() {
		Response response = given().
								spec(spec03).
							when().
								get("/2");
		response.prettyPrint();
		
		HashMap<String, String> map = response.as(HashMap.class); //De-Serialization
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		SoftAssert softAssert = new SoftAssert();
		// "completed" key'sinin degerinin false oldugunu verify ediniz.
		softAssert.assertEquals(map.get("completed"), false , "false olmaliydi ama degil");
		softAssert.assertAll();
		
		//userId, id, title,completed degerlerini verify ediniz 
		softAssert.assertEquals(map.get("userId"),1, "userId dogru degil");
		softAssert.assertEquals(map.get("id"),2, "Id dogru degil");
		softAssert.assertEquals(map.get("title"),"quis ut nam facilis et officia qui", "Title dogru degil");
		softAssert.assertAll();
		
		// Java Object'ini json formatina cevirme.
		Gson gson = new Gson();
		String jsonMap = gson.toJson(map);
		System.out.println(jsonMap);
	
	}

}
