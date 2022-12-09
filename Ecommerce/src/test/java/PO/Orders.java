package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders {
	public Orders(WebDriver ldriver)
    {
        PageFactory.initElements(ldriver,this);
    }
    	@FindBy(xpath="//input[@id='useremail']")
        @CacheLookup
        WebElement useremail_login;
        
        @FindBy(xpath = "//input[@id='password']")
        @CacheLookup
        WebElement password_login;
        
        @FindBy(xpath = "//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
        @CacheLookup
        WebElement login_button;
        
        @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
        @CacheLookup
        WebElement Location;
        
        @FindBy(xpath = "((//div[@class='nano-content']/ul/li)[2]/ul/li)[3]")
        @CacheLookup
        WebElement City;
        
        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[1]/a")
        @CacheLookup
        WebElement Addcity;
        
        @FindBy(xpath = "//*[@id=\"city\"]")
        @CacheLookup
        WebElement CityName;
        
        @FindBy(xpath = "//*[@id=\"addCity\"]/div/div[2]/div/div/button")
        @CacheLookup
        WebElement Add;
  
        @FindBy(xpath="//span[@class='user-avatar']")
        @CacheLookup
        WebElement Main;
        
        @FindBy(xpath="(//div[@class='drop-down dropdown-profile']/div/ul/li)[3]")
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
        public void ClickCity() {
            City.click();
        }
        public void ClickAddcity() {
            Addcity.click();
        }
        public void Entercity(String city) {
        	CityName.sendKeys(city);
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

