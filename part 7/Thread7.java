class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("0-argument user thread");
			}
	}
	
	public void run(int a)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("1-argument user thread");
			}
	}
}
	
			
class Thread7
{
	public static void main(String []args)
	{
		MyThread t1=new MyThread();
		t1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		System.out.println("khushi dadhaniya 23DCS017"); 
	}
}
