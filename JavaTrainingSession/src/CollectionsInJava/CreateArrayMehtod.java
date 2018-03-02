package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateArrayMehtod {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String> (); 
		
		// adding value in array
		list.add("Ravi");
		list.add("Ram");
		list.add("Sita");
		list.add("Raman");
		
		//traverse the value
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		//for (String s1 :list) {
			
		//	System.out.println(s1);
			
		//}
		
		
	
		
		
	}

}
