package edu.fusion;

class shape
{
	int a;
    String name="ABC";
    public void circle()
    {
    System.out.println("Draw Circle");
	}
    public void rectangle()
    {
        System.out.println("Draw Rectangle");
    }
} 

 class draw extends shape
{
	/*public void rectangle()
    {
        System.out.println("Draw Rectangle AGAIN");
    }
   public void circle()// same method name as parent class
    {
    System.out.println("Draw Circle again");
	}*/
}
class draw1 extends shape
 {
 public void triangle()
    {
        System.out.println("Draw Triangle");
    }
 }
