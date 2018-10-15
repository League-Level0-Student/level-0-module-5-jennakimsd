package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		for (int i = 0; i < 12; i++) {
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
	}
}
