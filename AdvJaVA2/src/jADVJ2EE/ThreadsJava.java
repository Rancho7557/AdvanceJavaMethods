class All extends Thread
{
	@Override  //this method is not not override
	public void run()  //public void fun()
	{
		try
		{
			
			for(int i = 1; i <= 5; i++)
		  {
			System.out.println("Tushar You can do this you just focse on it.");
			Thread.sleep(1000);
		  }
		}
		 catch(InterruptedException i)
		 {
			 
		 }
		 
	}
}
public class ThreadsJava {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
     All t = new All();
     t.start(); // t.fun();
     
     for(int i = 1; i <= 8; i++)
		{
			System.out.println("Tushar");
			Thread.sleep(1000);
		}
	}

}