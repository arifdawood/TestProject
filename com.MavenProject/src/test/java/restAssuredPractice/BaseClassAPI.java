package restAssuredPractice;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseClassAPI {

	/*
	for Authentication we have created a 
	BaseClass where we have created authentication
	and baseURI
	
	*/
	@BeforeClass
	public void setup() {
		RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication/";
		
	}
	
	
	
}
