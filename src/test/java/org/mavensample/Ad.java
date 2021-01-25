package org.mavensample;

import org.testng.annotations.*;

public class Ad {
	
	@Parameters({"username","password"})
	@Test
	private void test1(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);

}
}
