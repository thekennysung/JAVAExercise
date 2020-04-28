package question6;

import java.util.Scanner;

public class question6 {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		boolean condition = true;
		
		while (condition == true){		
			System.out.println("Please input desired calculation below with spaces inbetween: ");
		
			double n1 = scan.nextDouble();
			String op = scan.next();
			double n2 = scan.nextDouble();
			
				if (n1==0) {
					System.out.print("Good Bye :)");
					condition = false;
					
				}else{
					if(op.equals("+")) {
						System.out.println(n1 + n2);
						
					}else if(op.equals("-")) {
						System.out.println(n1 - n2);
						
					}else if(op.equals("*")) {
				        System.out.println(n1 * n2);
				        
				    }else if(op.equals("/")){
				        System.out.println(n1 / n2);
				        
				        }
				  
				    }
				}

				scan.close();
	}
}				
