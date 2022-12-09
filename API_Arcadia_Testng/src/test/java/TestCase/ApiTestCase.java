package TestCase;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.*;
import static  io.restassured.RestAssured.*;
public class ApiTestCase {
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
    
    public void GeneralSetting() {
        RestAssured.baseURI="https://arcadia.pisystindia.com/";
        Response resp=given().header("Authorization",str).when().get("api/generalSetting").then().contentType(ContentType.JSON).extract().response();
        System.out.println("get op is:" +resp.asPrettyString());
    }   
	@Test(priority=3)
	public void getBanner() {
        ExtentReportManager.startTest("Testcase_banner");
        RestAssured.baseURI="https://arcadia.pisystindia.com/";
        
        ExtentReportManager.extentTest.log(LogStatus.INFO, "Base Url used:", RestAssured.baseURI);
        ExtentReportManager.extentTest.log(LogStatus.INFO, "Header used:", "Authorization");
        ExtentReportManager.extentTest.log(LogStatus.INFO, "Endpoint used:", "api/getBanner");
        ExtentReportManager.extentTest.log(LogStatus.INFO, "Test Content type:", ContentType.JSON.toString());
        Response resp=given().header("Authorization", str).when().get("api/getBanner").then().contentType(ContentType.JSON).extract().response();
        ExtentReportManager.extentTest.log(LogStatus.INFO, "Expected output:", resp.asPrettyString());
        ExtentReportManager.extentTest.log(LogStatus.INFO, "Response time:", resp.getTimeIn(TimeUnit.SECONDS)+" ");
        JSONObject obj=new JSONObject(resp.body().asPrettyString());
        JSONArray arr =obj.getJSONArray("payload");
        
        if(arr.length()==3) {
            ExtentReportManager.extentTest.log(LogStatus.PASS, "Expected banners:3","actual banners:"+arr.length());
        }
        else {
            ExtentReportManager.extentTest.log(LogStatus.FAIL, "Expected banners:3","actual banners:"+arr.length());
        }
        System.out.println("GetBanner output:"+resp.body().asPrettyString());
        
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