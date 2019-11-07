package _02_robot_graffiti;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot Bread = new Robot();
		Bread.setPenWidth(100);
		Bread.setSpeed(10);
		Bread.miniaturize();
		Bread.setRandomPenColor();
		Bread.penDown();	
		Bread.move(260);
		Bread.turn(90);
		Bread.move(100);
		Bread.turn(180);
		Bread.move(100);
		Bread.turn(270);
		Bread.move(120);
		Bread.turn(270);
		Bread.move(100);
		
		
		
		
		
	}

}
