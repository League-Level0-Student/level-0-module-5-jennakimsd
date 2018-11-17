package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot sami= new Robot();
		//2. Set the speed to 100
sami.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a color", "Color Chooser", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Pink","Blue", "Green"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==1) {
		sami.setPenColor(Color.BLUE); 
		}
		if(colorChoice==2) {
		sami.setPenColor(Color.GREEN);
		}
		if(colorChoice==0) {
		sami.setPenColor(Color.PINK); 
		}
		//4. Ask the use how many polygons they want to be drawn.
		String number=JOptionPane.showInputDialog("How many polygons would you like to be drawn?");
		int num=Integer.parseInt(number);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < num; i++) {
		sami.penDown();
		for (int j = 0; j < 8; j++) {
		sami.move(30);
		sami.turn(45);
		}
		//6. Make it so your shapes do not overlap
		sami.penUp();
		sami.move(90);
		sami.turn(20);
		}
		//7. Challenge: add more colors to the Option Dialog.
	}
}

