package zensartest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class screenshot {
	public void valid() {
		try {
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\BD75001\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement usericon=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
			WebElement Registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist']))[6]/li[2]"));
			Actions action=new Actions(driver);
			action.moveToElement(usericon);
			Thread.sleep(2000);
			action.click(Registerlink).build().perform();
			Thread.sleep(2000);
			WebElement Firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
			WebElement Lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
			WebElement Email =driver.findElement(By.xpath("//input[@id='Email']"));
			WebElement Confirmemail =driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
			WebElement Username =driver.findElement(By.xpath("//input[@id='Username']"));
			WebElement checkAvailability =driver.findElement(By.xpath("//input[@type='button']"));
			Select country = new Select(driver.findElement(By.xpath("//select[@name='CountryId']")));
			
			country.selectByVisibleText("India");
			Select Timezone = new Select(driver.findElement(By.xpath("//select[@name='TimeZoneId']")));
			
			Timezone.selectByVisibleText("(UTC-09:30) Marquesas Islands");
			WebElement check=driver.findElement(By.xpath("//label[@class='custom-control-label']"));
			if(check.isEnabled()) {
				check.click();
			}else {
				check.click();
			}
			Thread.sleep(2000);
			WebElement Password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
			WebElement ConfirmPassword=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
			WebElement Mycompany=driver.findElement(By.xpath("//select[@name='Details.CompanyIndustryId']"));
			WebElement Register=driver.findElement(By.xpath("//input[@id='register-button']"));
			Firstname.sendKeys("Divya");
			Thread.sleep(2000);
			Lastname.sendKeys("Bezawada");
			Thread.sleep(2000);
			Email.sendKeys("bezavadadivyasri@gmail.com");
			Thread.sleep(3000);
			Confirmemail.sendKeys("bezavadadivyasri@gmail.com");
			Thread.sleep(2000);
			Username.sendKeys("Divyasri");
			Thread.sleep(2000);
			checkAvailability.click();
			Thread.sleep(2000);
			Password.sendKeys("Divya@123");
			Thread.sleep(1000);
			ConfirmPassword.sendKeys("Divya@123");
			Mycompany.sendKeys("I am student");
			Thread.sleep(1000);
			Register.click();
			Thread.sleep(1000);
			WebElement Title=driver.findElement(By.xpath("//h1[text()='Register']"));
			Assert.assertEquals(true, Title.isDisplayed());
			driver.quit();
			File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotFile, new File(".//Screenshots/screen.png"));
		}catch(Exception ex) {
			System.out.print(ex);
		}
	}
}
