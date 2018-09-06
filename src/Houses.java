import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
		static Robot rob = new Robot();
		static Random ran = new Random();
		
	public static void main(String[] args) {
		rob.setX(4);
		rob.setY(597);
		rob.setSpeed(200);
		rob.penDown();
		for (int i = 0; i <= 10; i++) {
		
			if (i % 2 == 0) {
				flathouse(ran.nextInt(300)+150);
			}
			else if (i % 2 == 1) {
				pointyroof(ran.nextInt(300)+150);
			}
		}
	}
	
	public static void flathouse(int height) {
		rob.setPenColor(Color.GREEN);
		rob.setAngle(90);
		rob.move(20);
		rob.setAngle(0);
		rob.setRandomPenColor();
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
		rob.setAngle(90);
		rob.setPenColor(Color.GREEN);
		rob.move(20);
		rob.hide();
	}
	public static void pointyroof(int height) {
		rob.setPenColor(Color.GREEN);
		rob.setAngle(90);
		rob.move(20);
		rob.setAngle(0);
		rob.setRandomPenColor();
		rob.move(height);
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.setAngle(180);
		rob.move(height);
		rob.setPenColor(Color.GREEN);
		rob.move(20);
		rob.hide();
	}

}
