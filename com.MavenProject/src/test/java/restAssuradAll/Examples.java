package restAssuradAll;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class Examples {

	//@Test
	public void test_get() {
		baseURI = "http://localhost:3000/";

		given()
		.get("subjects/1/users")
		.then()
		.statusCode(200)
		.and()
		.log().all();
	}

	//@Test
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

	//@Test
	public void test_patch() {

		baseURI = "http://localhost:3000/";

		JSONObject request = new JSONObject();
		request.put("lastname", "Shephered");

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("ContentType", "application/json")
		.body(request.toJSONString())
		.when()
		.patch("/users/4")
		.then()
		.statusCode(200)
		.log().all();
	}

	//@Test
	public void test_put() {

		baseURI = "http://localhost:3000/";

		JSONObject request = new JSONObject();
		request.put("firstname", "Mary");
		request.put("lastname", "Jane");
		request.put("subjectid", 1);

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("ContentType", "application/json")
		.body(request.toJSONString())
		.when()
		.put("/users/4")
		.then()
		.statusCode(200)
		.log().all();
	}

	
	@Test
	public void test_delete() {
		baseURI = "http://localhost:3000/";
		
		given()
			.delete("/users/4")
		.then()
			.statusCode(200);
	}
}
