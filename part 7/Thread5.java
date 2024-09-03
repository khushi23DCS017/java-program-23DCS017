class MyThread extends Thread
{
	
}

class Thread5
{
	public static void main(String []args)
	{
		MyThread t1=new MyThread();
		t1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
		System.out.println("khushi dadhaniya 23DCS017"); 
	}
}
