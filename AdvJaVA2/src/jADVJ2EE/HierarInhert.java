package jADVJ2EE;

class AB
{
	void input()
	{
		System.out.println("Enter Your Name: ");
	}
}
class BC extends AB
{
	void show()
	{
		System.out.println("My Name is TusharJava");
	}
}
class CD extends AB
{
	void display()
	{
		System.out.println("My Name is DhirajJava");
	}
}

public class HierarInhert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BC r = new BC();
		CD r2 = new CD();
		
		r.input(); r.show();
		r2.input(); r2.display();
	}

}
