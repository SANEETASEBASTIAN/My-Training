package collections;

import java.util.ArrayList;

public class ExampleCollection {
	

		public static void main(String[] args) {
			
			ArrayList <Integer> al = new ArrayList<Integer>();
			
			ArrayList<Character> a2 = new ArrayList<Character>();
			ArrayList<String> a3 = new ArrayList<String>();
			
			al.add(100);
			a2.add('a');
			a3.add("saneeta");
			
			al.add(200);
			a2.add('b');
			a3.add("Liza");
			System.out.println(al);
			System.out.println(a2);
			System.out.println(a3);
		}

	}

