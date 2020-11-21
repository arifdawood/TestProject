package restAssuradAll;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExample {

	@Test
	public void test_post() {

		baseURI = "http://localhost:3000/";

		JSONObject request = new JSONObject();
		request.put("firstname", "Tom");
		request.put("lastname", "Cooper");
		request.put("subjectid", 1);

		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.header("ContentType", "application/json")
			.body(request.toJSONString())
		.when()
			.post("/users")
		.then()
			.statusCode(201)
			.log().all();
	}



}
