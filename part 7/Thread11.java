class RunnableThread implements Runnable
{
	public void start()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Call no.="+i);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	}
}

class Thread11
{
	public static void main(String []args)
	{
		RunnableThread m1=new RunnableThread();
		Thread t1=new Thread(m1);
		t1.start();
		RunnableThread m2=new RunnableThread();
		Thread t2=new Thread(m2);
		t2.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
		  System.out.println("khushi dadhaniya 23DCS017"); 
	}
}
