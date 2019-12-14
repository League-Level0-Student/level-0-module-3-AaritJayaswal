//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
	 
		Robot joe = new Robot();
		
		//3. Ask the user what color they would like the robot to draw
		for(int i = 0; i<2000000000;i++) {
		String color = JOptionPane.showInputDialog(null, "What color would you like? (red, orange, yellow, green, blue, purple");
		
		//5. Use an if/else statement to set the pen color that the user requested

		if(color.equals ("red")) {
	joe.setPenColor(255,0,0);
}
		else if(color.equals("orange")) {
			joe.setPenColor(255,150,0);
			
		}
		else if(color.equals("yellow")) {
			joe.setPenColor(200,175,0);
			
		}
		else if(color.equals("green")) {
			joe.setPenColor(0,255,0);
			
		}
		else if(color.equals("blue")) {
			joe.setPenColor(0,0,255);
			
		}
		else if(color.equals("purple")) {
			joe.setPenColor(255,0,255);
			
		}

        //6. If the user doesn’t enter anything, choose a random color
		else if(color.equals("")) {
			JOptionPane.showMessageDialog(null,"Please enter a color");
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		joe.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
		joe.penDown();
		joe.setSpeed(100);
		
		for (int s = 0; s<4; s++) {
		joe.move(100);
		joe.turn(90);
		}
		
		joe.penUp();
		
		}

	}
}
