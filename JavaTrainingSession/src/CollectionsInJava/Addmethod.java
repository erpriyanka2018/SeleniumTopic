package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Addmethod {

	public static void main(String[] args) {

		ArrayList <String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Tom");
		list.add("Peter");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Rancho");
		list2.add("Stephen");
		
		
		//Add both list
		
		list.addAll(list2);
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
		
		System.out.println(itr.next());
		}
		
		
	}

}
