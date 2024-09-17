class IncrementThread extends Thread {
    int value;

    public IncrementThread(int value) {
        this.value = value;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        value++;
        System.out.println("Value after increment: " + value);
    }
}

public class pra35 {
    public static void main(String[] args) {
        IncrementThread thread = new IncrementThread(0);
        thread.start();
    }
}
