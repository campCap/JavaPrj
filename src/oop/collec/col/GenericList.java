package oop.collec.col;

public class GenericList<����> {
	private ����[] list;
	private int index;
	private int capacity;
	private int current;

	public GenericList() {
		list = (����[]) new Object[3];
		index = 0;
		capacity = 3;
		current = -1;
	}

	public void add(Object exam) {

		if (index >= capacity) {
			����[] temp =  (����[]) new Object[capacity + 2];
			for (int i = 0; i < list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
			capacity += 2;
		}

		list[index++] = (����) exam;
	}

	public ���� get(int i) {

		return list[i];
	}

	public int size() {

		return index;
	}
//==============================================������ �д� 
	public ���� next() {
		
		return list[current];
	}

	public boolean hasNext() {
		++current;
		
		return index >  current;
	}

}
