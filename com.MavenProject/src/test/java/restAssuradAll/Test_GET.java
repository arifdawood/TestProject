package restAssuradAll;

import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Test_GET {

	@Test
	public void Test1() {
		given().
			get("https://reqres.in/api/users?page=12").
		then().
			statusCode(200).
		//	body("data.id[1]", equalTo(8)).
		//	body("data.first_name", hasItems("Michael", "Lindsay")).
			log().all();
	}
}
