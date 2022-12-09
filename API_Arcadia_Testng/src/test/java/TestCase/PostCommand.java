package TestCase;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PostCommand {
	ResponseSpecification res;
	RequestSpecification req_spec;
	String str=" ";
	@BeforeClass
	public void setSpecification()
	{
		res=RestAssured.expect();
		res.statusLine("HTTP/1.1 200 OK");
		res.contentType(ContentType.JSON);
		ExtentReportManager.createReport("reportName");
	}
	@Test(priority=1)
	public void loginuser() {
		HashMap<String,String> params =new HashMap<String,String>();
		params.put("username","avez.kazi@pisystindia.com");
		params.put("password","Avez@123456");
		RestAssured.baseURI="https://arcadia.pisystindia.com/";
		Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("op is"+resp.asPrettyString());
		LinkedHashMap<String,Object> payload = resp.body().jsonPath().get("payload");
		
	}
	@Test(priority=2)
	public void invalidloginuser() {
		HashMap<String,String> params =new HashMap<String,String>();
		params.put("username","avez.kazipisystindia.com");
		params.put("password","Avez123456");
		RestAssured.baseURI="https://arcadia.pisystindia.com/";
		Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("op is"+resp.asPrettyString());
		LinkedHashMap<String,Object> payload = resp.body().jsonPath().get("payload");
		
	}
	 @AfterMethod
     public void tearDown() {
         ExtentReportManager.extentReport.endTest(ExtentReportManager.extentTest);
     }
     
     @AfterClass
     public void closeReport() {
         ExtentReportManager.extentReport.flush();
     }
}
