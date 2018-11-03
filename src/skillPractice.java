import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractice {
		public static void main(String[] args) {
			skillPractice skills = new skillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {

			String number= JOptionPane.showInputDialog("how many dimes do you have?");
			int dimes= Integer.parseInt(number);
			JOptionPane.showMessageDialog(null,"you have " + dimes*10 + " cents");
			
			String height= JOptionPane.showInputDialog("how tall are you in inches?");
			int number2= Integer.parseInt(height);
			if(number2 < 36) {
				JOptionPane.showMessageDialog(null, "eat your Wheaties");
			}
		}
void skill2() {
	for (int i = 1; i < 31; i++) {
		if(i%3==0) {
			System.out.println(i);
		}
	}
}

void skill3() {
	Random random= new Random();
	int r=random.nextInt(20);
	System.out.println(r);
	
	Random name= new Random();
	int q=name.nextInt(10);
	System.out.println(q);
	
	JOptionPane.showMessageDialog(null, "the difference between the numbers is " + (r-q));
}

void skill4() {
	String city= JOptionPane.showInputDialog("what city do you live in?");
	if(city.equals("San Diego")) {
		JOptionPane.showMessageDialog(null, "you live in America's Finest City");
	}
	else {
		JOptionPane.showMessageDialog(null, "you should move to San Diego");
	}
	
	int cars= 3;
	if(cars==0) {
		JOptionPane.showMessageDialog(null, "i bet you use public transportation");
	}
	if(cars==1) {
		JOptionPane.showMessageDialog(null, "toyota");
	}
	if(cars>=1) {
		JOptionPane.showMessageDialog(null, "you have " + cars*4 + " wheels");
	}
}

void skill5() {
	String school= JOptionPane.showInputDialog("what is the name of your school?");
	JOptionPane.showMessageDialog(null, school + " is a fantastic school");
}
}
