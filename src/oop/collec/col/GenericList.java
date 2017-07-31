package oop.collec.col;

public class GenericList<용주> {
	private 용주[] list;
	private int index;
	private int capacity;
	private int current;

	public GenericList() {
		list = (용주[]) new Object[3];
		index = 0;
		capacity = 3;
		current = -1;
	}

	public void add(Object exam) {

		if (index >= capacity) {
			용주[] temp =  (용주[]) new Object[capacity + 2];
			for (int i = 0; i < list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
			capacity += 2;
		}

		list[index++] = (용주) exam;
	}

	public 용주 get(int i) {

		return list[i];
	}

	public int size() {

		return index;
	}
//==============================================데이터 읽는 
	public 용주 next() {
		
		return list[current];
	}

	public boolean hasNext() {
		++current;
		
		return index >  current;
	}

}
