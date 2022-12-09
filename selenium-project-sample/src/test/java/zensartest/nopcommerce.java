package zensartest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class nopcommerce {
	public static void main(String[]args) {
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
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
