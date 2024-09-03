
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Voter {
    int age; 

    public static void main(String[] args) {
        Voter voter = new Voter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        voter.age = scanner.nextInt();

        try {
            if (voter.age < 18) { 
                throw new InvalidAgeException("You are not eligible for voting in 2024");
            }
            System.out.println("You have successfully cast your vote!");
        } 
		catch (InvalidAgeException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
    }
}
