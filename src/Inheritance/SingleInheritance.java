package Inheritance;

	class Animal
	{  
	void eat1()
	{
	System.out.println("eating...");
	}  
	}  
	class Dog1 extends Animal
	{  
	void bark1()
	{
	System.out.println("barking...");
	}  
	}  
	public	class SingleInheritance
	{  
	public static void main(String args[])
	{  
	Dog1 d=new Dog1();  
	d.bark1();  
	d.eat1();  
	}}  