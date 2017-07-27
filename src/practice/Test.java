package practice;

import java.util.ArrayList;
import java.util.HashMap;

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
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("steak", "meat");
		map.put("macnuget", "chicken");
		System.out.println(map.get("steak"));
	}
}
