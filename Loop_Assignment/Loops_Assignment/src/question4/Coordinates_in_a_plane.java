package question4;

import java.util.Scanner;

public class Coordinates_in_a_plane {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the maximum x");
		int x = scan.nextInt();
		System.out.println("What is the maximum y");
		int y = scan.nextInt();
		
		System.out.println("Here are your possible coordinates");
		
		for(int n = 0; n <= x; n++) {
			for(int i = 0; i <= y; i++) {
				System.out.println("(" + n + "," + i + ")");
			}
			
		}	
		
	}

}
