package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class List1 {
	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<Integer>();
		lst.add(0);
		lst.add(25);
		lst.add(45);
		lst.add(75);

		Iterator<Integer> itr = lst.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		lst.remove(2);
		System.out.println("After Removed:");
		Iterator<Integer> itr2 = lst.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		// lst.get(1);
		System.out.println(lst.get(1));

		System.out.println(lst.size());

		System.out.println(lst.set(1, 98));
		System.out.println(lst);

		lst.clear();
		System.out.println(lst);

	}

}
