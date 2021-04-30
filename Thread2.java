class Thread2 implements Runnable 
{
	public void run()
	{
		for (int i=10; i>=1; i--)
		{
			System.out.println("Thread2: "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}	
}