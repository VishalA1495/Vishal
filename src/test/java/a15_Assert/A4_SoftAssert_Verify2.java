package a15_Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A4_SoftAssert_Verify2 {
	
	@Test
	public void test() {
		
		SoftAssert soft = new SoftAssert();
		
		System.out.println("email");
		System.out.println("password");
		System.out.println("login");
		
		String expected = "Vishal Aher";
		String actual = "Vishal Aher";
		
		soft.assertEquals(actual, expected);      // passed
		
		System.out.println("test done");          // execute
		
		soft.assertAll();
				
	}

}
