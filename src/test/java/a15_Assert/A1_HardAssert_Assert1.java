package a15_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A1_HardAssert_Assert1 {

	@Test
	public void test1() {
		System.out.println("email");
		System.out.println("password");
		System.out.println("login");
		
		String Expected = "Vishal Aher";
		String actual = "vishal aher";
		
		Assert.assertEquals(actual, Expected);           // fail
		
		System.out.println("test done");                 // it will not execute because test is failed
		
		
		
	}
	
}
