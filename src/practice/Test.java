package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {

		ArrayList<String> menu = new ArrayList<String>();
		menu.add(0, "steak");
		menu.add(1, "french fries");
		menu.add(2, "chicken");
		menu.add(3, "beef steak");
		System.out.println(menu);
		System.out.println(menu.contains("steak"));
		System.out.println(menu.size());
		System.out.println(menu.remove("steak"));
		System.out.println(menu.remove(0));
		System.out.println(menu);
		String[] names = new String[24];
	}
}
