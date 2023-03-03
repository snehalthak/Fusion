package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) 
	{

		  LinkedList<String> name = new LinkedList<String>();
		    name.add("Snehal");
		    name.add("teju");
		    name.add("pallu");
		    name.add("switi");
		    System.out.println(name);
		    Iterator<String> itr=name.iterator();
		    while(itr.hasNext()) //if condition true then it goes into loop
		    {
		    	System.out.println(itr.next());
		    }
		    
		    
		    //addFirst
		    name.addFirst("Dipika");
		    System.out.println(name);
		    
		    //addLast
		    name.addLast("Shiv");
		    System.out.println(name);
		    
		    //removeFirst
		    name.removeFirst();
		    System.out.println(name);
		    
		    //removeLast
		    name.removeLast();
		    System.out.println(name);
		    
		    //getFirst
		    System.out.println(name.getFirst());

		    //getLast
		    System.out.println(name.getLast());
		    
		    
	}

}
