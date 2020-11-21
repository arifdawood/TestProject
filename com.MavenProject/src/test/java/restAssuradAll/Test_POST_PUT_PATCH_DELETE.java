package restAssuradAll;

import java.util.Map;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class Test_POST_PUT_PATCH_DELETE {

	@Test
	public void Test1_POST() {
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("name",	"Raghav");
		map.put("job", "Teacher");
		System.out.println(map);*/
		
		JSONObject request = new JSONObject();
		request.put("name",	"Arif");
		request.put("job", "QA");
		System.out.println(request.toJSONString());
		
		given().
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).log().all();
		
	}
	
//	@Test
	public void Test1_PUT() {
		
		JSONObject request = new JSONObject();
		request.put("name",	"Raghav");
		request.put("job", "Teacher");
		System.out.println(request.toJSONString());
		
		given().
			header("Content-Type", "application/Json").
			contentType(ContentType.JSON).
			accept(request.toJSONString()).
			body(request.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();
		
	}
	
	//@Test
	public void Test1_Patch() {
	
		JSONObject request = new JSONObject();
		request.put("name",	"Raghav");
		request.put("job", "Teacher");
		System.out.println(request.toJSONString());
		
		given().
			header("Content-Type", "application/Json").
			contentType(ContentType.JSON).
			accept(request.toJSONString()).
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	
	//@Test
	public void Test1_Delete() {
	
		
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
		
	}
	
}
