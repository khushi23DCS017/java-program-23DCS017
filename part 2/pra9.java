import java.util.Scanner;
public class pra9 {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string ");
    String str = input.nextLine();
    //String new_str = "";

             String result = "";
    for (int i = 0; i < str.length(); i++) {
        result += str.substring(i, i + 1) + str.substring(i, i + 1);
	}
        //String result2 = null;
        String result2 = result;
        System.out.println(result2);
        
    }
}
