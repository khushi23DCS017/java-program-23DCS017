import java.util.*;

public class extra5 {
    public static void main(String[] args) {
        int a=9,b=0,c;
            //System.out.println(5/0);
                try{
					 c = a / b;
					 System.out.println(c);
					 //System.exit(0);
                   }
				   
				  catch(ArithmeticException e)
		        {
			  System.out.println("Exception solved 1" + e.toString());
			  
		        }
				
				finally
				{
					System.out.println("hi");
					//System.exit(0);
				}
				System.out.println("how are you");
	}		
    }
