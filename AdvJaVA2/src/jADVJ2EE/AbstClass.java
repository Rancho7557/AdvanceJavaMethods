package jADVJ2EE;

abstract class animal
{
	void legs()
	{
		System.out.println("?ll animals have 4 legs");
	}
	abstract void sound();
	abstract void eat();
 
}
class Dog extends animal
{
	@Override
	void sound()
	{
		System.out.println("log log log log .....");
	}
	void eat()
	{
		System.out.println("meet meet .....");
	}
}
class Cow extends animal
{
	@Override
	void sound()
	{
		System.out.println("OOOOU OOOU .....");
	}
	void eat()
	{
		System.out.println("GRASS GRASS .....");
	}
}
public class AbstClass {

	public static void main(String[] args) {
		 
Dog d = new Dog();
Cow c = new Cow();

d.sound(); d.eat(); d.legs();
c.sound(); c.eat(); c.legs();

	}

}
//Abstract method class real Example for you nd i hope you will undarstant it.
