package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.Mainhub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainhubStepDefination {
	public WebDriver driver;
	public  Mainhub obj;
@Given("open chrome browser")
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
    obj = new Mainhub(driver);
}


@Then("opens url {string}")
public void opens_url(String url) {
	driver.get(url);
}

@Then("user enters email as {string} and password as {string}")
public void user_enters_email_as_and_password_as(String string, String string2) {
    obj.enterEmailAndPassword(string, string2);
}

@Then("user click on signin")
public void user_click_on_signin() {
    obj.ClickLogin();
}

@Then("click on locations")
public void click_on_locations() {
   obj.ClickLocation();
}

@Then("click on country")
public void click_on_country() {
    obj.ClickCountry();
}

@Then("click on Addcountry")
public void click_on_addcountry() {
	obj.ClickAddCountry();
}

@Then("user enters the country as {string}")
public void user_enters_the_country_as(String string) {
    obj.EnterCountry(string);
}

@Then("click on add")
public void click_on_add() {
    obj.ClickAdd();
}

@Then("click on Main")
public void click_on_main() {
    obj.Clickmain();
}

@Then("click on logout")
public void click_on_logout() {
    obj.ClickLogout();
}
}
