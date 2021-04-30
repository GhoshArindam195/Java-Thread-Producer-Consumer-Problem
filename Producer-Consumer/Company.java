class Company
{
	int item;
	boolean flag=true;
	synchronized public void produce(int n)
	{
		//Using sleep method(More efficient)..................
		if(!flag)
		{
			try{wait();}catch(Exception e){e.printStackTrace();}
		}
		item=n;
		System.out.println("Item : "+item+" produced");
		flag=false;
		notify();

		// without using sleep method(less efficient).......................
		// if(flag)
		// {

		// 	item=n;
		// 	System.out.println("Item : "+item+" produced");
		// 	flag=false;
		// 	notify();
		// }
	}
	synchronized public void consume()
	{
		//Using sleep method(More efficient)..................
		if(flag)
		{
			try{wait();}catch(Exception e){e.printStackTrace();}
		}
		System.out.println("Item : "+item+" consumed");
		flag=true;
		notify();

		// without using sleep method(less efficient).......................
		// if(!flag)
		// {
		// 	System.out.println("Item : "+item+" consumed");
		// 	flag=true;
		// 	notify();
		// }
	}
}