package jADVJ2EE;

interface vehical
{
	String Name = "KIA SONNET";   //public + static  + final
	//int Speed = 170;              //public + static  + final
	
	void start();               //interface by default public + abstract
	void stop();                //interface by default public + abstract
	default void color()
	{
		System.out.println("KIA SONNET COLOR IS BLACK IS MOST POPULER AROUND THE EARTH");
	}
	static void speed()
	{
		System.out.println("Kia sonnet speed is 172 Km/H");
	}
}
public class AbstInterf  implements vehical {
	
	@Override //a notation 
	public void start()
	{
		System.out.println("start(): insert key & press start button  " + Name);
	
	}
	@Override
	public void stop()
	{
		System.out.println("stop(): exit key");
	
	}

	public static void main(String[] args) {
		 
    AbstInterf c = new AbstInterf();
    c.start(); c.stop(); c.color();
    vehical.speed();
   // System.out.println(speed);
	}

}
