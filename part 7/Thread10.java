class RunnableThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("user thread");
        }
    }
}

class Thread10 {
    public static void main(String[] args) {
        RunnableThread m1 = new  RunnableThread();
		 Thread t1=new Thread(m1);
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
        System.out.println("khushi dadhaniya 23DCS017"); 
    }
}
