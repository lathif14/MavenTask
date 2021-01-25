package org.mavensample;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Sample1 {
	@Parameters({"username","password"})
	@Test
	private void test1(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		

	}
}
