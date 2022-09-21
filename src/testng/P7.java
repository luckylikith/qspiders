package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P7 {
	
	@Test
	public void test1() {
		
		System.out.println("Test 1 begins");
		SoftAssert s1 = new SoftAssert();
		s1.fail();
		System.out.println("Test 1 ends");
		s1.assertAll();
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test 2 begins");
		
		System.out.println("Test 2 ends");
	}

}
