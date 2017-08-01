package net.wikidocs.tele;

import java.util.ArrayList;

public class Packet {

	private ArrayList<Item> item = new ArrayList<Item>();
	
	public static void main(String[] args) {
		Packet packet = new Packet();

		Item item1 = Item.create("이름", 10, "차명건");
		Item item2 = Item.create("전화번호",11 , "01052754312");
		
		packet.addItem(item1);
		packet.addItem(item2);

		System.out.println("[" + packet.raw() + "]");

	}

	public Item getItem(int index) {
		return item.get(index);
	}

	public void addItem(Item item) {
		this.item.add(item);
	}

	
	public String raw() {
		StringBuffer result = new StringBuffer();
		for(Item item : item)
			result.append(item.raw());
		return result.toString();
	}
	
}
