package Stepdefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.Orders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class OrdersStepDefination {
	public WebDriver driver;
	public  Orders obj;
	@Given("open Chrome browser")
	public void open_chrome_browser() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj = new Orders(driver);
	}

	@When("opens URL {string}")
	public void opens_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("enters Email as {string} and password as {string}")
	public void enters_email_as_and_password_as(String uname, String password) {
	    obj.enterEmailAndPassword(uname, password);
	}

	@When("userb Click on Login")
	public void user_click_on_login() {
	    
		 obj.ClickLogin();
	    
	}

	@Then("pagetitle should be {string}")
	public void pagetitle_should_be(String string) {
	   
		Assert.assertEquals(string,driver.getTitle());
	    
	}



	@Then("Click on Locations")
	public void click_on_locations() {
	    obj.ClickLocation();
	}

	@Then("Click on City")
	public void click_on_city() {
	    obj.ClickCity();
	}

	@Then("Click on AddCity")
	public void click_on_add_city() {
	    obj.ClickAddcity();
	}

	@Then("user enters city as {string}")
	public void user_enters_city_as(String string) {
	    obj.Entercity(string);
	}
	@Then("click on Add")
	public void click_on_add() {
		obj.ClickAdd();
	}
	@Then("title should be {string}")
	public void title_should_be(String string) {
	    
	}

	@Then("user click on main")
	public void user_click_on_main() {
	    obj.Clickmain();
	}

	@Then("user click on logout")
	public void user_click_on_logout() {
	    obj.ClickLogout();
	}
}
