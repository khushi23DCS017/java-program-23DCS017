class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("user thread");
        }
    }
}

class Thread1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
        System.out.println("khushi dadhaniya 23DCS017"); 
    }
}
