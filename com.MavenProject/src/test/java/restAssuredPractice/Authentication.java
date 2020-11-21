package restAssuredPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Authentication extends BaseClassAPI{
	
	/*
	Inheritate the baseClass which have
	authentication and baseURI and 
	*/
	
	@Test
	public void test1() {
		int code = RestAssured.given()
				.get()
				.getStatusCode();
		System.out.println("Response Code = " + code);
	}
}
