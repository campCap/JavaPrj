package oop.collec.col;


import oop.collec.col.GenericList.GIterator;

public class AsyncProgram {

	public static void main(String[] args) {

		GenericList<Integer> list = new GenericList<>();

		for (int i = 0; i < 123; i++)
			list.add(i + 1);
		
		/*
		 * Thread th1 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { download(list , 1)
		 * 
		 * } });
		 */

		new Thread(() -> {

			download(list, 1);

		}).start();

		download(list, 2);

		System.out.println("프로그램 종료");

	}

	private static void download(GenericList<Integer> list, int num) {
		/*
		 * for (int i = 0; i < 100; i++) System.out.printf("%d : %d%%\n", num,
		 * list.get(i));
		 */
		GIterator iter = list.iterator();

		while (iter.hasNext())
			System.out.printf("%d : %d%%\n", num, iter.next());

	}

}
