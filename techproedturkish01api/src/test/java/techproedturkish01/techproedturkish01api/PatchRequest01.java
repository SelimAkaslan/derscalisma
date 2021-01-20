package techproedturkish01.techproedturkish01api;

import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PatchRequest01 extends TestBase{
	
	@Test
	public void patch01() {
		
	Response responseBeforeBatch = given().
							spec(spec03).
						when().
							get("/200");
	responseBeforeBatch.prettyPrint();
	
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("title", "Selim Akaslan");
	
	Response responseAfterPatch = given().
									contentType(ContentType.JSON).
									spec(spec03).
									body(jsonObject.toString()).
								when().
									patch("/200");
	responseAfterPatch.prettyPrint();
	
	responseAfterPatch.
						then().
					assertThat().
						statusCode(200);
	
	JsonPath json = responseAfterPatch.jsonPath();
	
	assertEquals(jsonObject.get("title"),json.get("title"));
	
	SoftAssert softAssert = new SoftAssert();
	
	softAssert.assertEquals(json.get("title"),jsonObject.get("title"));
	softAssert.assertAll();
	
	}
}
