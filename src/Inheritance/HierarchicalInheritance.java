package Inheritance;

//parent class  
class Student  
{  
public void Stud()  
{  
System.out.println("I am Student");  
}  
}  
class Science extends Student  
{  
public void sciencestud()  
{  
System.out.println("I am science student.");  
}  
}  
class Commerce extends Student  
{  
public void commstud()  
{  
System.out.println("I am commerce Student");  
}  
}  
class Arts extends Student  
{  
public void artstud()  
{  
System.out.println("I am arts Student");  
}  
}  

public class HierarchicalInheritance
{  
public static void main(String args[])  
{  
Science s = new Science();  
Commerce c = new Commerce();  
Arts a = new Arts();  
//all the sub classes can access the method of super class
s.Stud();
s.sciencestud();
c.Stud();
c.commstud();
a.Stud();
a.artstud();
}  
}   