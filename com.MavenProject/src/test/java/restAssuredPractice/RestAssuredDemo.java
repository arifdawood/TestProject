package restAssuredPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class RestAssuredDemo {

	@Test
	public void test_Get() {
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).
		log().all(). // display all the values
		body("data.id[1]", equalTo(7), "data.first_name", equalToIgnoringCase("Michael"));
		
		//	body("data.id[1]", equalTo(8)).
	//	body("data.first_name", hasItems("Michael", "Lindsay"));
	}
	
	// @Test
	public void test_Post() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("first_name", "Ali");
		map.put("last_name", "Nasir");
		System.out.println(map);
		
		JSONObject request = new JSONObject();
		request.put("first_name", "Ali");
		request.put("last_name", "Nasir");
		
		System.out.println(request);
		System.out.println(request.toJSONString(map));
		
		given().
			body(request.toJSONString()).
		then().
			statusCode(200).log().all();
		
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).
		log().all(); // display all the values
		
	}
}
