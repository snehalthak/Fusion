package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceExample {

	public static void main(String[] args) {
		Set<String> st=new HashSet<String>();
		st.add("snehal");
		st.add("switi");
		st.add("aarti");
		st.add("teju");
		st.add("pallavi");
		st.add("teju");
		st.add("vidya");
		st.add("teju");
		st.add("vidya");

		
		
		Iterator<String> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next().hashCode());
		}
		
		/*
		 * System.out.println(st.remove(2)); System.out.println(st.isEmpty());
		 * System.out.println(st.hashCode()); System.out.println(st.toString());
		 * System.out.println(st.contains(itr)); System.out.println(st.equals(itr));
		 */
		
		  System.out.println("After removed"); 
		  st.remove(itr);
		  Iterator<String> itr1=st.iterator();
		  while(itr1.hasNext()) { System.out.println(itr1.next());
		  //System.out.println(itr.next().hashCode()); }
		 
		
	}
	}
}