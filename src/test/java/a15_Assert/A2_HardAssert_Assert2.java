package a15_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A2_HardAssert_Assert2 {
	
	@Test
	public void test() {
		System.out.println("email");
		System.out.println("password");
		System.out.println("login");
		
		String expected = "Vishal Aher";
		String actual = "Vishal Aher";
		
		Assert.assertEquals(actual, expected);      // passed
		
		System.out.println("test done");             // it will execute
		
	}

}
