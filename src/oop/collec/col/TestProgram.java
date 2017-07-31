package oop.collec.col;

import java.util.ArrayList;

public class TestProgram {

	public static void main(String[] args) {
		GenericList<String> list = new GenericList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list.add("fuck it");
		
		list.add("bye");
		list.add("hello");
		list.add("int i");
		list.add("int i");
		list.add("int i");
		list.add("int i");
		list.add("int i");
		list.add("int i");
		list.add("int i");
		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
			
	}
}
