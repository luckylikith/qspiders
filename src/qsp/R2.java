package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class R2 {
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		Runtime.getRuntime().exec("notepad");

		Robot a1 = new Robot();
		a1.keyPress(KeyEvent.VK_Q);
		a1.keyPress(KeyEvent.VK_S);
		a1.keyPress(KeyEvent.VK_P);

		a1.keyPress(KeyEvent.VK_SHIFT);
		a1.keyPress(KeyEvent.VK_J);
		a1.keyPress(KeyEvent.VK_S);
		a1.keyPress(KeyEvent.VK_P);
		a1.keyRelease(KeyEvent.VK_SHIFT);

		a1.keyPress(KeyEvent.VK_ENTER);
		a1.keyPress(KeyEvent.VK_A);
		a1.keyPress(KeyEvent.VK_B);
		a1.keyPress(KeyEvent.VK_LEFT);
		a1.keyPress(KeyEvent.VK_SPACE);
	}

}
