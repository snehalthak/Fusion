package edu.fusion;

public class Upcasting1 {
		

		public static void main(String[] args)
	    {
	    shape s=new draw();
	   s.circle();//override circle method
	    s.a=10;
	   System.out.println(s.a);
	  System.out.println(s.name);
	   s.rectangle();
	   //  s.triangle();
	    	//draw1 d=new draw1();	
	       // d.triangle();
	      // d.circle();
	       // d.rectangle();---it gives compile time error
	    }
	}
