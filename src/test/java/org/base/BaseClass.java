package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
		public static WebDriver driver;
		public static WebDriver lanchBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		public static void launchUrl(String url) {
		driver.get(url);
		}
		public static void fill(WebElement w,String s) {
			w.sendKeys(s);
		}
		public static void btnClick(WebElement w) {
			w.click();
		}
		public static String grtAttribute(WebElement w) {
			return w.getAttribute("value");
			

		}
		public static String getText(WebElement w) {
			String text = w.getText();
			return text;
		}
		public static void dragDrop(WebElement src, WebElement des) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, des).perform();

		}
		public static void movetoelemnt(WebElement w) {
			Actions a=new Actions(driver);
			a.moveToElement(w).perform();


		}
		public static void contextCli(WebElement w) {
			Actions a=new Actions(driver);
			a.contextClick(w).perform();
			
		}
		public static void doubleCli(WebElement w) {
			Actions a=new Actions(driver);
			a.doubleClick(w).perform();
		
		}
		public static void actionClick(WebElement w) {
			Actions a=new Actions(driver);
			a.click(w).perform();

		}
		public static void actionsendKeys(WebElement w,String s) {
			Actions a=new Actions(driver);
			a.moveToElement(w).sendKeys(s).perform();
		}
		public static void selectByIndx(WebElement w,int index) {
			Select s=new Select(w);
			s.selectByIndex(index);
		}
		
		}

