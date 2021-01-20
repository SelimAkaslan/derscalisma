package techproedturkish01.techproedturkish01api;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.response.Response;

public class Delete01 extends TestBase{
	@Test
	public void delete01() {
		Response responseBeforeDelete = given().
											spec(spec03).
										when().
											get("/69");
		responseBeforeDelete.prettyPrint();
		
		
		Response responseAfterDelete = given().
										spec(spec03).
									when().
										delete("/69");
		responseAfterDelete.prettyPrint();
		
		Response getResponseAfterDelete = given().
				spec(spec03).
			when().
				get("/69");
		getResponseAfterDelete.prettyPrint();
		
		responseAfterDelete.
						then().
						assertThat().
						statusCode(200);
		
	}
	

}
