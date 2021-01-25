package org.Excel;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage extends BaseClass {
	
	
	
	public FbLoginPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private static WebElement userName;
	
	@FindBy(id="pass")
	private static WebElement userPassword;
	
	@FindBy(name="login")
	private static WebElement loginbtn;
	
	
	public void setUserNameAndPassword(String arg1,String arg2) {
		userName.sendKeys(arg1);
		userPassword.sendKeys(arg2);
	}
	
	public  void clickLogin() {
		btnClick(loginbtn);
	}
	
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver(); 
//		driver.get("https://www.facebook.com/");
//		WebElement sel = driver.findElement(By.xpath("//a[@role='button']"));
//		 sel.click();
//		 WebElement fn = driver.findElement(By.name("firstname"));
//		 WebElement ln = driver.findElement(By.name("lastname"));
//		 WebElement ema = driver.findElement(By.name("reg_email__"));
//		 WebElement pass = driver.findElement(By.name("reg_passwd__"));
//		 
//	}

}
