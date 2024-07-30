import java.util.*;
public class pra8
{
public static void main(String args[])
{
int n,i;
int count=0;
Scanner s=new Scanner(System.in);
int[] a=new int[10];
System.out.print("Enter the number of element in the array ");
 n=s.nextInt();
 for ( i = 0; i < n; i++) 
  {
            System.out.print("Enter array element " + (i + 1) + ": ");
			 a[i] = s.nextInt();
  	
		int x=9;
		if(a[i]==x)
		{
		count++;
		
		}
  }
		System.out.print("total 9 is " + count);
  
}
}
