package jADVJ2EE;

class A //Super class multi-level inheritance
{
	int a, b, c;
	void add()
	{
		a = 20; b = 30;
		c = a + b;
		System.out.println("Sum of two Numbers: " + c);
	}
	void sub()
	{
		a = 200; b = 1000;
		c = a - b;
		System.out.println("Subtraction of two Numbers: " + c);
	}
}
class B extends A //Sub 1 class multi-level inheritance
{
	void multi()
	{
		a = 20; b = 30;
		c = a * b;
		System.out.println("Multi of two Numbers: " + c);
	}
	void div()
	{
		a = 2300; b = 1000;
		c = a / b;
		System.out.println("Division of two Numbers: " + c);
	}
}
class C extends B //Sub2 class multi-level inheritance object multi level value
{
	void reminder()
	{
		a = 220; b = 119;
		c = a % b;
		System.out.println("Reminder Value Numbers: " + c);
	}
}
public class MultInheritance {

	public static void main(String[] args) {
		 
		C r = new C();
		r.add(); r.sub(); r.multi(); r.div(); r.reminder();

	}

}
