package a13_TestNG_Keywords;

import org.testng.annotations.Test;

public class A2_Enable_False {
	
	                              // if we do not want to execute one of the test case
	

	@Test
	public void m1() {
		System.out.println("test1");
	}
	@Test(enabled=false)                    // this test case will not execute
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
