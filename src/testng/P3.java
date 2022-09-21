package testng;

import org.testng.annotations.Test;

public class P3 {

	@Test(invocationCount = 6,priority = 500)
	public void kutra() {
		System.out.println("bow bow");
	}

	@Test(invocationCount = 3)
	public void manjar() {
		System.out.println("meowwwww");
	}

	@Test(priority = -50, invocationCount = 5)
	public void gadav() {
		System.out.println("dhenchu");
	}
}
