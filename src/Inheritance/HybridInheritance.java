package Inheritance;

class GrandFather  
	{  
	public void show()  
	{  
	System.out.println("I am grandfather.");  
	}  
	}  
	//inherits GrandFather properties  
	class Father extends GrandFather  
	{  
	public void show()  
	{  
	System.out.println("I am father.");  
	}  
	}  
	//inherits Father properties  
	class Son extends Father  
	{  
	public void show()  
	{  
	System.out.println("I am son.");  
	}  
	}  
	//inherits Father properties  
	class Daughter extends Father  
	{  
	public void show()  
	{  
	System.out.println("I am a daughter.");  
	}  
	}
public class HybridInheritance
{
	public static void main(String args[])  
	{  
	Son s1=new Son();
	s1.show();
	Daughter d = new Daughter();  
	d.show();  
	}  
	}  
