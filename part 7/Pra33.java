import java.util.Scanner;

class SumThread extends Thread {
     int start;
     int end;
     int result;
	

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        result = 0;
        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " value: " + result);
    }
}

public class Pra33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = s.nextInt();
        System.out.print("Enter the number of threads: ");
        int Threads = s.nextInt();

        int Size = n / Threads;
        SumThread[] threads = new SumThread[Threads];

        for (int i = 0; i < Threads; i++) {
            int start = i * Size + 1;
            int end = (i == Threads - 1) ? n : (i + 1) * Size;
            threads[i] = new SumThread(start, end);
            threads[i].start();
        }

        

        int sum = 0;
        for (SumThread thread : threads) {
            sum += thread.result;
        }

        System.out.println("The sum of the numbers from 1 to " + n + " is: " + sum);
    }
}

