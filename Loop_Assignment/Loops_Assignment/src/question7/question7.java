package question7;

public class question7 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 4; i++)
		{
		    System.out.println("\n" + i + ":");
		    for (int z = 0; z < 5; z++)
		    {
		        String n= "";
		        int j = 0;
		        
		        if (i==1) {
		            j = 8;
		            
		        }else if (i==2){
		            j = 5-j;
		            
		        }else {
		            j = 1 + j*2;
		            
		        }for ( int y = 0; y < z; y++){
		            n=n+"8";
		        }
		        
		        System.out.println(n);
		        
		    }
		    
		}

	}

}
