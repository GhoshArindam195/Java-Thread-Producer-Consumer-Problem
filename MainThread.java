import java.util.*;
class MainThread
{
	public static void main(String args[])
	{
			Thread1 th1 = new Thread1();
			Thread t1 = new Thread(th1);

			Thread2 th2 = new Thread2();
			Thread t2 = new Thread(th2);
			t1.start();
			t2.start();
	}
}