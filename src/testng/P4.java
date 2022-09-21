package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P4 {
	@BeforeTest
	public void r1() {
		System.out.println("Before test");
	}
	@AfterTest
	public void r2() {
		System.out.println("After test");
	}
	
	@BeforeClass
	public void q1() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void q2() {
		System.out.println("after class");
	}
	
	@Test
	public void t2() {
		System.out.println("from T2");
	}
	
	@Test
	public void t1() {
		System.out.println("from T1");
	}
	
	@BeforeMethod
	public void a1() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void a2() {
		System.out.println("After method");
	}

}
