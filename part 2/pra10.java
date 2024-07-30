import java.util.*;
public class pra10 {
	public static String sortString(String s) {
        
        char[] charArray = s.toCharArray();
        
       
        Arrays.sort(charArray);
        
       
        return new String(charArray);
    }
	

public static void main(String[] args) {
char c;
String reverse="";
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string ");
    String str = input.nextLine();
	
	int a=str.length();
	System.out.println(a);
	
	String lc=str.toLowerCase();
	System.out.println(lc);
	
	String uc=str.toUpperCase();
	System.out.println(uc);
	
	for(int i=0;i<str.length();i++)
	{
		c=str.charAt(i);
		reverse=c+reverse;
		
	}
	System.out.println(reverse);

	
	System.out.println(sortString(str));
	
	
}
}
