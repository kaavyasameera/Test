package api.concepts.APIConcepts;

import java.util.HashMap;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GETCall 
{
@Test
	public void getCall()
	{
	Response r = 	RestAssured.
		given().
		when().
		get("https:/vbcvb/petstore.swagger.io/v2/store/order/6").
		then().
		statusCode(200).
	extract().response();
	String response  = r.asString();
	
	System.out.println(response);
	
	JsonPath path = r.jsonPath();
	int status = path.get("petId");
	System.out.println(status);
	
	}

@Test
public void postCall()
{
	
	HashMap<String, Object> createUser = new HashMap<String, Object>();
	createUser.put("id", (int)20);
	createUser.put("username", "Balu");
	createUser.put("firstName", "SOnu");
	createUser.put("lastName", "Hari");
	createUser.put("email", "hari@gmail.com");
	createUser.put("password", "haro@nbdh");
	createUser.put("phone", "5465765");
	createUser.put("userStatus", (int)0);
	
	
	Response r = 	RestAssured.
			given().
			contentType("application/json").
			body(createUser).
			when().
			post("https://petstore.swagger.io/v2/user/createWithList").
			then().
			statusCode(200).
		extract().response();
		String res = r.asString();
		System.out.println(res);
}

@Test
public void DeleteCall()
{

	Response r = 	RestAssured.
			given().
			
			when().
			delete("https://petstore.swagger.io/v2/user/Hari").
			then().
			statusCode(200).
		extract().response();
		String res = r.asString();
		System.out.println(res);
}
}
