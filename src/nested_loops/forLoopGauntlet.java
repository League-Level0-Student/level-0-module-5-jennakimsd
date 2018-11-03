package nested_loops;

public class forLoopGauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i > -1; i--) {
		System.out.println(i);
	}
	for (int i = 2; i < 101; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	for (int i = 0; i < 100; i++) {
	if(i%2==1) {
		System.out.println(i);
		}
	}
	for (int i = 0; i < 501; i++) {
		if(i%2==1) {
			System.out.println(i+" is odd");
			}
		else {
			System.out.println(i+" is even");
		}
	}
	for (int i = 7; i < 778; i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}
	int year=2004;
	for (int i = 0; i < 15; i++) {
			System.out.println("in " + year + " I was " +i);
		year++;
		
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i + " " + j);
		}
	}
	int m=1;

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(m+" ");
			m++;
			}
		System.out.println();
		}
	int k=1;
	
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			System.out.print(k+" ");
			k++;
		}
	System.out.println();	
	}
	
	for (int i = 0; i < 6; i++) {
		for (int j = 0; j < 6; j++) {
			if(j<=i) {
				System.out.print(" * ");
			}
		}
		System.out.println();
	}
	
}

}




