package org.junit;

import java.util.Date;

import org.Excel.FbLoginPage;
import org.base.BaseClass;

public class Facebook extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		lanchBrowser();
		

	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("Starts At..."+d);

	}
	@Test
	public void test() {
		launchUrl("https://www.facebook.com/");
		FbLoginPage l= new FbLoginPage(); 
		l.setUserNameAndPassword("lathif", "12345");
		l.clickLogin();

	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("Starts At..."+d);

	}
	@AfterClass
	public static void afterClass() {
		driver.quit();

	}

}
