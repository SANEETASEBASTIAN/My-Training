package collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoCollection {

	public void demo() {
		List<String> list =new ArrayList<String>(); //list
		list.add("Orange");
		list.add("Apple");
		list.add("Mango");
		list.add("Grapes");
		list.add(3,"Banana");
		System.out.println("List size "+list.size());//size
		System.out.println("1st list is "+list);
		
		 System.out.println("isempty: " +list.isEmpty());
		 System.out.println("contains Orange: " +list.contains("Orange"));
		 System.out.println("indexOf Apple "+list.indexOf("Apple"));
		 System.out.println("LastindexOf Banana "+list.lastIndexOf("Banana"));
		
		list.set(2, "Kiwi");//set
		System.out.println("Gets in index 4 "+list.get(4));
		System.out.println("Changed list is "+list);
		
		list.remove(0);
		list.remove("Grapes");
		System.out.println("removed  list is "+list);
		
		
		ArrayList<Character> arrylis=new ArrayList<Character>();
		ArrayList<Integer> arrylis2=new ArrayList<Integer>();
		 arrylis2.add(1);
		 arrylis2.add(3);
		 arrylis2.add(4);
		 arrylis2.add(5);
		 arrylis2.add(17);
		 
		 arrylis.add('a');
		 arrylis.add('b');
		 arrylis.add('c');
		 arrylis.add('d');
		 arrylis.add('e');
		
		 ArrayList<Integer> arrylis3=new ArrayList<Integer>();
		 arrylis3.add(100);
		 arrylis3.add(300);
		 arrylis3.add(400);
		 arrylis3.add(500);
		 arrylis3.add(3,170);
		 System.out.println("Array list3 "+arrylis3);
		 
		 arrylis3.addAll(0,arrylis2);
		 System.out.println("Array list1 "+arrylis);
		 System.out.println("Array list2 "+arrylis2);
		 System.out.println("Array list3 "+arrylis3);
		 
		 arrylis3.removeAll(arrylis2);
		 System.out.println("Array after remove list3 "+arrylis3);
		 
		 System.out.println("Equals :"+arrylis3.equals(arrylis2));
	
		 System.out.println("ContainsAll: "+arrylis3.containsAll(arrylis2));
		 arrylis.clear();
		 arrylis3.retainAll(arrylis2);
		 System.out.println("Array list after Retain "+arrylis3);
		// System.out.println("1st list is "+list);
		 for(int i=0;i<list.size();i++) {
			 String element=list.get(i);
			 System.out.print(element+" ");
		 } System.out.println();
		 for(String var:list) {
			 System.out.println(var);
		 }System.out.println();
		 Iterator<String> itr=list.iterator();
		 while(itr.hasNext()) {
		 System.out.println(itr.next());
		 }
		 itr.forEachRemaining(var->{
			 System.out.println(var);
			 });
			 list.forEach(var->{
				 System.out.println(var);
			 });
		 }
	public void map() {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(0, "Data1");
		map.put(1, "Data2");
		map.put(2, "Data3");
		map.put(3, "Data4");
		 System.out.println(map);
		 
		 Set<Entry<Integer,String>>set= map.entrySet();
		 Iterator<Entry<Integer,String>> it=set.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());}
		 
		 }
	
	public static void main(String args[]) {
		DemoCollection d= new DemoCollection();
		d.demo();
		d.map();
	}
}
