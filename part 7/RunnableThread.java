class RunnableThread implements Runnable {
    public void run() {
         
            System.out.println("user thread");
			}
        
    

    public static void main(String[] args) {
         RunnableThread m1 = new  RunnableThread();
		 Thread t1=new Thread(m1);
        t1.start();
		
		
		
        
        System.out.println("khushi dadhaniya 23DCS017"); 
    }
}
