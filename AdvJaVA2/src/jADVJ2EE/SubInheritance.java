package jADVJ2EE;

class students //super class
{
	int roll, marks;
	String Name;
	void input()  //protected mostly use in inheritance
	       {
		     System.out.println("Enter roll, name and marks: ");
	       }
}

public class SubInheritance extends students // sub class
{   
void display()
{
	roll = 7557; Name = "Tushar"; marks = 72;
	System.out.println(roll+"  "+ Name + "  " + marks);	
}
	public static void main(String[] args) {
		SubInheritance r = new SubInheritance();
		r.input(); r.display();

	}

}

 
