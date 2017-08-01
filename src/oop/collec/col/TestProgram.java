package oop.collec.col;

import oop.collec.col.GenericList.GIterator;

public class TestProgram {

	public static void main(String[] args) {
		GenericList<String> list = new GenericList<String>();
		
		list.add("fuck it");
		list.add("bye");
		list.add("hello");
		list.add("int i");
		list.add("int k");
		list.add("int j");
		list.add("int a");
		list.add("int b");
		list.add("int n");
		list.add("int z");
		
		GIterator lter = list.iterator();
		
		while(lter.hasNext()) {
			System.out.println(lter.next());
		}
			
	}
}
