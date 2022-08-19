package a13_TestNG_Keywords;

import org.testng.annotations.Test;

public class A3_Invocation_count {
	
	                                // if we want to execute one of the test case multiple time
	

	@Test
	public void m1() {
		System.out.println("test1");
	}
	@Test(invocationCount=3)                    // this test will execute 3 times
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
