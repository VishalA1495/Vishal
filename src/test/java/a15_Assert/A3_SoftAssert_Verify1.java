package a15_Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A3_SoftAssert_Verify1 {
	
	@Test
	public void test() {
		
		SoftAssert soft = new SoftAssert();
		
		System.out.println("email");
		System.out.println("password");
		System.out.println("login");
		
		String expected = "Vishal Aher";
		String actual = "vishal aher";
		
		soft.assertEquals(actual, expected);           // failed
		
		System.out.println("tets done");               // execute
		 
		soft.assertAll();
		
	}

}
