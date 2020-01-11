package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	
	public static void main(String[]args) {
		
		
		drawSquare();
		
		
	
	}

	
	public static void drawSquare() {
		Robot joe = new Robot();
		joe.setSpeed(100);
		joe.penDown();
		for(int  i = 0; i<4;i++) { 
		joe.move(100);
		joe.turn(90);
		}
		
	}
	
	
}
