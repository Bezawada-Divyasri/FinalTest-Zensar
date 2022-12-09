package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.Login;
import PO.Orders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SiteengineerStepDefination {
	public WebDriver driver;
    public Login obj;
    public  Orders O;
	@Given("Chrome browser")
	public void chrome_browser() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj = new Login(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String password) {
	    obj.enterEmailAndPassword(uname, password);
	}

	@When("Click on Login")
	public void click_on_login() {
	    
		 obj.ClickLogin();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(title,driver.getTitle());
	   
	}

	@When("User Click NewDemo")
	public void user_click_new_demo() {
	    
	}

	@When("user click on Log Out Link")
	public void user_click_on_log_out_link() {
	    
	}
	@Then("Click on Vendors")
	public void click_on_vendors() {
	    obj.ClickVendors();
	}

	@Then("Click on Add Vendors")
	public void click_on_add_vendors() {
		obj.ClickAddVendors();
	}

	@Then("User enters Name as {string} and Address as {string} and Contact as {string} and Email as {string}")
	public void user_enters_name_as_and_address_as_and_contact_as_and_email_as(String string, String string2, String string3, String string4) {
	    obj.details(string, string2, string3, string4);
	}

	@Then("Click on Add")
	public void click_on_add() {
	    obj.ClickAdd();
	}

	@Then("Title should be {string}")
	public void title_should_be(String string) {
	   
	}
	@Then("Click on Action")
	public void click_on_action() {
	    obj.ClickAction();
	}

	@Then("User enters Uname as {string} and Uaddress as {string} and Ucontact as {string} and Uemail as {string}")
	public void user_enters_uname_as_and_uaddress_as_and_ucontact_as_and_uemail_as(String string, String string2, String string3, String string4) {
	    obj.Udetails(string, string2, string3, string4);
	}
	@Then("Click Update")
	public void click_update() {
	    obj.ClickUpadte();
	}
	/*@Then("click on check")
	public void click_on_check() {

	}*/

	@Then("Click on status")
	public void click_on_status() {
	    obj.ClickStatus();
	}

	@Then("Click on view")
	public void click_on_view() {
	    obj.Clickview();
	}

	@Then("Click on Allocate")
	public void click_on_allocate() {
	    obj.ClickAllocate();
	}

	@Then("User enters SelectProduct as {string}")
	public void user_enters_select_product_as(String string) {
	    obj.selectproduct(string);
	}

	@Then("Click on Addproduct")
	public void click_on_addproduct() {
	    obj.ClickAddProduct();
	}
	@Then("Click on Main")
	public void click_on_main() {
	    obj.ClickMain();
	}

	@Then("Click on Logout")
	public void click_on_logout() {
	    obj.ClickLogout();
	}
	@Then("close browsers")
	public void close_browsers() {
	    
	}
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    
	}
}
