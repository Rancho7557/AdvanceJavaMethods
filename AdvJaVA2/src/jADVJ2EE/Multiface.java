package jADVJ2EE;
interface Tushar 
{
	void show(); // public  + abstract
	 
}
interface Dhanurkar 
{
	void Disk();  // public + abstract
	 
}

public class Multiface implements Tushar, Dhanurkar
{
  public void show()  // it is not write public then show error because this is vhik to compilation.
  {
	  System.out.println("This is Multiple interface Tushar");  
  }
  public void Disk()  // it is not write public then show error because this is vhik to compilation.
  {
	  System.out.println("This is Multiple interface Dhanurkar");  
  }
	public static void main(String[] args) {
		 
     Multiface m = new Multiface();
      m.show(); m.Disk();
	}

}



 

 
