package question5;

public class question5 {

	public static void main(String[] args) {
		
		
		System.out.println("Increment 2 in each step:");		
		for(int x = 10; x < 21; x = x + 2 ) {
			
			if(x == 16) {
				continue;
			}
			System.out.println(x);	
		}
		
		System.out.println("Increment 1 in each step:");
		for(int x = 10; x < 21; x++ ) {
			
			if(x == 16) {
				continue;
			}
			if(x % 2 == 0) {
			System.out.println(x);
			}
		}
		System.out.println("With an endless loop:");
		for(int x = 10; ; x++ ) {
			
			if(x == 16) {
				continue;
			}
			if(x % 2 == 0) {
			System.out.println(x);
			}
			if(x >= 20) {
				break;
			}
		}	
		
		
	}
}
