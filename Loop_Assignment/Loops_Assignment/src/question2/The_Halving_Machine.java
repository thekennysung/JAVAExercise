package question2;

import java.util.Scanner;

public class The_Halving_Machine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input an integer below: \n");
		int x = scan.nextInt();
		
			if (x % 2 == 1) {
				for(x = x  + 1; x != 0; x = x / 2) {
					//x = (x + 1) / 2;
					System.out.println(x);
				}
			}else if (x <= 0) {
				System.out.println("HEY! That's against the rules.");
				
			}else if(x % 2 == 0) {
				for(; x != 0; x = x / 2) {
					//x = (x + 1) / 2;
					System.out.println(x);
				}
			}
				
	}

}

