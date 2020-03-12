package coreexample;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hashsetexamoles {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();

		set.add(1);
		set.add(5);
		set.add(8);
		set.add(7);
		set.add(4);
		set.add(6);

		Set<Integer> set1 = new TreeSet<Integer>();

		set.add(11);
		set.add(11);
		set.add(1);
		set.add(22);
		set.add(4);

		Set<Integer> set2 = new TreeSet<Integer>();

		set2.addAll(set);
		set2.addAll(set1);

		int Numcode = 0;
		Iterator<Integer> iterator = set2.iterator();
		while (iterator.hasNext()) {
			Numcode = iterator.next();
			System.out.println(Numcode);
		}
		System.out.println(set2.isEmpty());
		System.out.println(set2.remove(11));
		System.out.println(set2.hashCode());
		System.out.println(set2.equals(set1));
		System.out.println(set2.contains(1));
		System.out.println(set2.containsAll(set));
		System.out.println(set2.spliterator());
		System.out.println(set2.size());
		System.out.println(set2.toArray());
		System.out.println(set2.stream());
		System.out.println(set2.toString());

	}

}
