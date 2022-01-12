package jADVJ2EE;

public class EarlyBindOverM {
	// int add()
	// {
	//     int a = 20, b = 39, c;
	//     c = a + b;
	//     return c;
	// }
	void add()
	{
		int a = 10, b = 40, c;
		c = a + b;
		System.out.println(c);
	}
	void add(int x, int y)
	{
		int c;
		c = x + y;
		System.out.println(c);
	}
	void add(int x, double y)
	{
		 double c;
		c = x + y;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		EarlyBindOverM show = new EarlyBindOverM();
		show.add(75, 54.45); show.add(); show.add(100, 400); 
		
		//int add = show.add();
		//System.out.prinyln(add);  output screen 129.45, 59, 500;
	}

}


 