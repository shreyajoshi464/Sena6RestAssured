package GotDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Nat {
	Response response;
	
	@Test
	@Given ("API for foreign Exchange")
	 public void  api_for_foreign_exchange(){
		RestAssured.baseURI = "https://ratesapi.io";
	}
	@Test
	@When("posted with future date information")
	public void posted_with_correct_Information(){
		response = RestAssured.get("/api/latest");
		
	}
	 
	 @Test
	 @Then("validate positive response code received")
	 public void validate_positive_response_code_received(){
		 int statusCode= response.getStatusCode();
		 System.out.println("Response Code"+statusCode);
		 
		 response = RestAssured.given().headers("Content-Type","application/json").log().all().get("/api/2020-11-28").then().
				 assertThat().statusCode(200).log().all().extract().response();
				 
	 }
	 
	 
	 
	 
	 
	 
	 

}
