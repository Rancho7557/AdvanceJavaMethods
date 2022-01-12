package jADVJ2EE;

class shape     // super class
{
         void draw()
         {
         //we don't know about type of shape but it is super class 
        System.out.println("can't Say shape Type  it is super class discuss");

         }
}
class square extends shape     //sub class extends super class
{
    // @Override
     void draw()
     {
     super.draw();
     System.out.println("Square shape");
     
     }

}

public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape r = new square();
		r.draw();
	}

}
