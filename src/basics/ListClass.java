package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ListClass {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(30);
		l.add(12);
		l.add(35);
		l.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});

		System.out.println(l);
		l.forEach(l1 -> System.out.println(l1.MAX_VALUE));
		System.out.println(l.stream().anyMatch(new Predicate() {

			@Override
			public boolean test(Object t) {
				Integer i = (Integer) t;
				if (i % 2 == 0) {
					i = i + 1;
					System.out.println(i);
				}
				return false;
			}

		}));
		System.out.println(l);
		System.out.println(new UnaryOperator() {

			@Override
			public Object apply(Object t) {
				List<Integer> list = (List <Integer>) t;
				list.addAll(l);
				list.forEach(l->System.out.println(l));
				System.out.println("------------------------");
				return list;
			}

		});
		
		
	}

}
