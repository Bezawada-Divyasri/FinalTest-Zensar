package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login {
public WebDriver ldriver;   //Ldriver can be written as driver
    
    public Login(WebDriver ldriver)
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
        @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[7]/a")
        @CacheLookup
        WebElement Vendors;
        @FindBy(xpath="//div[@class='pull-right']/a")
        @CacheLookup
        WebElement AddVendors;
        
        @FindBy(xpath="//input[@id='vendor_name']")
        @CacheLookup
        WebElement Name;
        
        @FindBy(xpath="//textarea[@id='vendor_address']")
        @CacheLookup
        WebElement Address;
        
        @FindBy(xpath="//input[@id='vendor_contact']")
        @CacheLookup
        WebElement Contact;
        
        @FindBy(xpath="//input[@id='vendor_email']")
        @CacheLookup
        WebElement Email;
        
        @FindBy(xpath="//button[@type='submit']")
        @CacheLookup
        WebElement Add;
        
        @FindBy(xpath="//a[@class='ti-pencil-alt']")
        @CacheLookup
        WebElement Action;
        
        @FindBy(xpath="//input[@id='vendor_name']")
        @CacheLookup
        WebElement Uname;
        
        @FindBy(xpath="//textarea[@id='vendor_address']")
        @CacheLookup
        WebElement Uaddress;
        
        @FindBy(xpath="//input[@id='vendor_contact']")
        @CacheLookup
        WebElement Ucontact;
        
        @FindBy(xpath="//input[@id='vendor_email']")
        @CacheLookup
        WebElement Uemail;
        
        @FindBy(xpath="//button[@type='submit']")
        @CacheLookup
        WebElement Update;
        
        @FindBy(xpath="(//input[@type='checkbox'])[1]")
        @CacheLookup
        WebElement check;
        
        @FindBy(xpath="//span[@class='slider round']")
        @CacheLookup
        WebElement status;
        
        @FindBy(xpath="//a[@title='View Vendor Product Details!']")
        @CacheLookup
        WebElement view;
        
        @FindBy(xpath="//a[@class='btn btn-success btn-flat m-b-10 m-l-5']")
        @CacheLookup
        WebElement Allocate;
        
        @FindBy(xpath="//select[@class='form-control required']")
        @CacheLookup
        WebElement SelectProduct;
        
        @FindBy(xpath="//button[@type='submit']")
        @CacheLookup
        WebElement Addproduct;
        
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
        public void ClickVendors() {
            Vendors.click();
        }
        public void ClickAddVendors() {
            AddVendors.click();
        }
        public void details(String name,String address,String contact,String email) {
        	Name.sendKeys(name);
        	Address.sendKeys(address);
        	Contact.sendKeys(contact);
        	Email.sendKeys(email);
        }
        public void ClickAdd() {
        	Add.click();
        }
        public void ClickAction() {
        	Action.click();
        }
        public void Udetails(String uname,String uaddress,String ucontact,String uemail) {
        	Uname.clear();
        	Uname.sendKeys(uname);
        	Uaddress.clear();
        	Uaddress.sendKeys(uaddress);
        	Ucontact.clear();
        	Ucontact.sendKeys(ucontact);
        	Uemail.clear();
        	Uemail.sendKeys(uemail);
        }
        public void ClickUpadte() {
        	Update.click();
        }
        public void ClickCheck() {
        	check.click();
        }
        public void ClickStatus() {
        	status.click();
        }
        public void Clickview() {
        	view.click();
        }
        public void ClickAllocate() {
        	Allocate.click();
        }
        public void selectproduct(String product) {
        	Select select=new Select(SelectProduct);
        	select.selectByVisibleText(product);
        			
        }
        public void ClickAddProduct() {
        	Addproduct.click();
        }
     
        public void ClickMain() {
        	Main.click();
        }
        public void ClickLogout() {
        	Logout.click();
        }
    }

