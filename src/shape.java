import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class shape {
	public static void main(String[] args) {		
Robot r2d2= new Robot();
r2d2.setPenWidth(10);
String color= JOptionPane.showInputDialog("What color would you like the robot to draw?");
String shapes= JOptionPane.showInputDialog("How many shapes would you like the robot to draw?");
int number= Integer.parseInt(shapes);
for (int i = 0; i < number; i++) {
	for (int j = 0; j < 4; j++) {
		r2d2.penDown();
		r2d2.move(50);
		r2d2.turn(90); }
	r2d2.penUp();
	r2d2.move(70);}
}
}
