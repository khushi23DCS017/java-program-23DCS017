
import java.util.*;

public class pra24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             int result;
        
            System.out.print("Enter the first integer (x): ");
            int x = scanner.nextInt();

            System.out.print("Enter the second integer (y): ");
            int y = scanner.nextInt();

            if (y == 0) {
                try{
					 result = x / y;
                   }
				   catch(ArithmeticException e)
		        {
			  System.out.println("Exception solved 1" + e.toString());
			  
		        }
				   
			} 
            
           else{
            result = x / y;
            System.out.println("x / y = " + result);
		   }
        
	}		
    }
