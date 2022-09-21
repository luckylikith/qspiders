package qsp;

import java.awt.AWTException;
import java.awt.Robot;

public class R1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.out.println("start");
		Robot a1 = new Robot();
		int x=50,y=50;
		for(int i=0;i<25;i++) {
			a1.mouseMove(x, y);
			y=y+10;
			x=x+50;
			Thread.sleep(500);
		}
		System.out.println("the end");

	}

}
