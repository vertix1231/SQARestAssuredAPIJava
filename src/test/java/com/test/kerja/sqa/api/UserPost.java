package com.test.kerja.sqa.api;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserPost {

	@Test
	public void test01_post() {
		MainTest_CRUD mainTest_CRUD = new MainTest_CRUD();
		JSONObject request = new JSONObject();
		
		request.put("id", "2");
		request.put("name", "andreXdua");
		request.put("email", "axnddua@gmail.com");
		request.put("gender", "male");
		request.put("status", "inactive");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
//		https://gorest.co.in/public/v1/users
		RequestSpecification httpRequest = (RequestSpecification) given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://gorest.co.in/public/v1/users") //POST
		.then()
		.statusCode(201)
		.log().all();
//		System.out.println(httpRequest);
//		System.out.println(request.);
//		 Response response= 
		mainTest_CRUD.valueid = 0;
		
//		assertEquals(given().auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26").sta, 200);
	}
}
