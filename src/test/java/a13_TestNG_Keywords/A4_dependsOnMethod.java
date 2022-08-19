package a13_TestNG_Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A4_dependsOnMethod {
	
	            // if 2nd test case is depend upon 1st test case and we want to execute 2nd only if the 1st case passed
	

	@Test
	public void m1() {
		System.out.println("test1");
		Assert.assertTrue(false);                  // making m1() false ---> m2() will not execute
	}
	@Test(dependsOnMethods="m1")                   // this test case is depend on first case m1()
	public void m2() {
		System.out.println("test2");
	}
	@Test
	public void m3() {
		System.out.println("test3");
	}
	@Test
	public void m4() {
		System.out.println("test4");
	}
	

}
