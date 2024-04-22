package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOperation {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		removeSecondElement(list);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void removeSecondElement(List<Integer> list) {
		list.remove(1);
	}

}
