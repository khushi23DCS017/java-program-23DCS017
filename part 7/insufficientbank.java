
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class insufficientbank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		double balance;

        System.out.print("Enter your initial account balance: ");
        balance = scanner.nextDouble();

        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
			if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance in your account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
