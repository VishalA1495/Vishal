package a13_TestNG_Keywords;

import org.testng.annotations.Test;

public class A1_Priority {


	@Test(priority=4)                                // in priority we can also give priority as '0' and '-2' (negative)
	public void m1() {
		System.out.println("test1");
	}
	@Test(priority=3)
	public void m2() {
		System.out.println("test2");
	}
	@Test(priority=2)
	public void m3() {
		System.out.println("test3");
	}
	@Test(priority=1)
	public void m4() {
		System.out.println("test4");
	}
	
	
}
