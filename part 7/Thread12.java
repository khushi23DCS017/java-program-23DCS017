class RunnableThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("0-argument user thread");
		}
		run(100);
	}
	
	public void run(int a)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("1-argument user thread");
		}
	}
}

class Thread12
{
	public static void main(String []args)
	{
		RunnableThread m1=new RunnableThread();
		Thread t1=new Thread(m1);
		t1.start();
		RunnableThread m2=new RunnableThread();
		Thread t2=new Thread(m2);
		t2.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		
		  System.out.println("khushi dadhaniya 23DCS017"); 
	}
}'
