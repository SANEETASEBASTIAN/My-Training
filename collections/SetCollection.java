package collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetCollection {
	public static void main(String[] args) {
		
		Set <Integer> a1= new HashSet<Integer>();
		 a1.add(1);
		 a1.add(3);
		 a1.add(4);
		 a1.add(5);
		 a1.add(17);
		 System.out.println("Sets"+a1);
		 System.out.println("Sets Size " +a1.size());
		 System.out.println("isempty: " +a1.isEmpty());
		 System.out.println("contains: " +a1.contains(4));
		
		 a1.remove(17);
			System.out.println("removed list is "+a1);
			
			
			Set <String> a2= new HashSet<String>();
			 a2.add("Saneeta");
			 a2.add("Liza");
			 a2.add("Muhsina");
			 a2.add("Athira");
			 a2.add("Jisha");
			
			
			Set <String> a3= new HashSet<String>();
			 a3.add("Duck");
			 a3.add("Cat");
			 a3.add("Mouse");
			 a3.add("Elephant");
			 a3.add("Lion");
			 System.out.println("Set 2 "+a2);
			 System.out.println("Set 3"+a3);
			 a3.addAll(a2);
			 System.out.println("Set 3 addall "+a3);
			 a3.addAll(a2);
			 System.out.println("Equals:"+a3.equals(a2));
			 
			 a3.removeAll(a2);
			 System.out.println("Array after remove set "+a3);
			 
			 System.out.println("ContainsAll: "+a3.containsAll(a2));
			 a1.clear();
			 a3.retainAll(a2);
			 System.out.println("Array list3 "+a3);
			
		
	}

}




