package a13_TestNG_Keywords;

import org.testng.annotations.Test;

public class A5_Groups {
	
	@Test(groups="Sanity")
	public void m1() {
		System.out.println("test1");
	}
	@Test(groups="Sanity")
	public void m2() {
		System.out.println("test2");
	}
	@Test(groups="Reggression")
	public void m3() {
		System.out.println("test3");
	}
	@Test(groups="Reggression")
	public void m4() {
		System.out.println("test4");
	}
	@Test(groups="Critical Reggression")
	public void m5() {
		System.out.println("test5");
	}
	@Test(groups="Critical Reggression")
	public void m6() {
		System.out.println("test6");
	}
	
	

}
