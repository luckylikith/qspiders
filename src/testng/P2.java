package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P2 {
	@Test
	public void carrot() {
		Reporter.log("carrot", true);
	}

	@Test
	public void brinjal() {

		Reporter.log("brinjal", true);
	}

	@Test
	public void spinach() {

		Reporter.log("spinach", false);
	}
}
