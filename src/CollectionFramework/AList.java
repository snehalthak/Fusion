package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AList {

	public static void main(String[] args) {
	
		    List<String> cars = new ArrayList<>();
		    //add element into array
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    Iterator<String> itr=cars.iterator();
		    while(itr.hasNext()) //if condition true then it goes into loop
		    {
		    	System.out.println(itr.next());
		    }
		    
		    //remove element into array
		    cars.remove(1);
		    System.out.println("After Removed");
		    Iterator<String> itr1=cars.iterator();
		    while(itr1.hasNext())
		    {
		    	System.out.println(itr1.next());
		    }
		    
		    //get size of array
		    System.out.println("Size of array:" +cars.size());
		    
		    //get index of array
		    System.out.println("Get the number:" +cars.get(1));
		    
		    //set index or change data
		    cars.set(2, "Swift");
		    System.out.println("Changed the 2nd index data:" +cars);
		    cars.add("Jaguar");
		    cars.add("Volvo");
		    System.out.println("New Index:" +cars);
		    
		    //remove all element in array
		    cars.clear();
		    System.out.println(cars);
		    
		    }
	}
