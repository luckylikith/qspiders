package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class P1 {
	
	@BeforeSuite
	public void f1() {
		System.out.println("Before suite");
	}

	@Test
	public void apple() {
		System.out.println("Apple method");
	}

	@Test
	public void banana() {
		System.out.println("banana method");
	}

}
