class Producer extends Thread
{
	Company com;
	Producer(Company com)
	{
		this.com = com;
	}
	public void run()
	{
		int i = 1;
		while (true)
		{
			com.produce(i++);
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