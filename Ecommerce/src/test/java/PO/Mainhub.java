package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainhub {
	public Mainhub(WebDriver ldriver)
    {
        PageFactory.initElements(ldriver,this);
    }
    	@FindBy(xpath="//*[@id=\"useremail\"]")
        @CacheLookup
        WebElement useremail_login;
        
        @FindBy(xpath = "//*[@id=\"password\"]")
        @CacheLookup
        WebElement password_login;
        
        @FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/form/button")
        @CacheLookup
        WebElement login_button;
        
        @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
        @CacheLookup
        WebElement Location;
        @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
        @CacheLookup
        WebElement Country;
        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
        @CacheLookup
        WebElement AddCountry;
        @FindBy(xpath = "//*[@id=\"Country\"]")
        @CacheLookup
        WebElement CountryName;
        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/button")
        @CacheLookup
        WebElement Add;
        @FindBy(xpath = "/html/body/div[2]/div[2]/ul/li/span")
        @CacheLookup
        WebElement Main;
        @FindBy(xpath = "(//div[@class='drop-down dropdown-profile']/div/ul/li)[3]")
        @CacheLookup
        WebElement Logout;
        public void enterEmailAndPassword(String str1, String str2) {
            useremail_login.sendKeys(str1);
            password_login.sendKeys(str2);
        }
        
        public void ClickLogin() {
            login_button.click();
        }
        public void ClickLocation() {
            Location.click();
        }
        public void ClickCountry() {
        	Country.click();
        }
        public void ClickAddCountry() {
            AddCountry.click();
        }
        public void EnterCountry(String city) {
        	CountryName.sendKeys(city);
        }
        public void ClickAdd() {
            Add.click();
        }
        public void Clickmain() {
            Main.click();
        }
        public void ClickLogout() {
        	Logout.click();
        }
}
