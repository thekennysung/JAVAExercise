package question3;

import java.util.Scanner;

public class Letter_at_a_time {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input desired string below:");
		String n = scan.nextLine();
		
		
		for(int x = 0; x < n.length(); x++) {
			System.out.println(n.charAt(x));
		}
	}

}
