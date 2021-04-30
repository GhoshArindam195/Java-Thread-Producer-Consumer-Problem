class Consumer extends Thread
{
	Company com;
	Consumer(Company com)
	{
		this.com = com;
	}
	public void run()
	{
		while(true)
		{
			// System.out.println("Trying to consume");
			com.consume();
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