package org.mavensample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fh{
	@Parameters({"username","password"})
	@Test
	private void test1(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);

	}
}
