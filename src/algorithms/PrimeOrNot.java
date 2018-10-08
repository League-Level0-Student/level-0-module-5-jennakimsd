package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	boolean isPrime= true;
	String number= JOptionPane.showInputDialog("Enter a number");
	int num=Integer.parseInt(number);
	for(int i= 2; i<num-1; i++) {
		if (num%i==0) {
			isPrime= false;
			JOptionPane.showMessageDialog(null, "This is not a prime number");
			break;
		}
	
		}
	if(isPrime) {
		JOptionPane.showMessageDialog(null, "This is a prime number");
	}
	
}
}
