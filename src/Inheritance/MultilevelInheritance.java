package Inheritance;

class animal1
{
	void eat()
	{
		System.out.println("Eating:");
	}
}
class dog extends animal1
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class babydog extends dog
{
	void sleep()
	{
		System.out.println("Sleeping");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
babydog bd=new babydog();
bd.eat();
bd.bark();
bd.sleep();
	}

}
