package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
	
	// List elemanlarini tekrarli olarak 1 kere yazmak sartiyla ekrana alfabetik sirali olarak yazdiralim
		
		list.
			stream().
			distinct().
			sorted().
			forEach(System.out::println);
		
		
		System.out.println("========");
		// List elemanlarini tekrarli olarak 1 kere yazmak sartiyla ekrana uzunliklarina gore sirali olarak yazdiralim
		list.
		  stream().
		  distinct().
		  sorted(Comparator.comparing(t->t.length())).
		  forEach(System.out::println);
		
		System.out.println("========");
		// List elemanlarini tekrarli olarak 1 kere yazmak sartiyla elemanlari son harflerine sirali olarak yazdiralim
		list.
		  stream().
		  distinct().
		  sorted(Comparator.comparing(t->t.substring(t.length()-1))).
		  forEach(System.out::println);
		
		
		System.out.println("========");
		// List elemanlarini tekrarli olarak 1 kere yazmak sartiyla ekrana uzunliklarina gore tersten sirali olarak yazdiralim
		list.
		  stream().
		  distinct().
		  sorted(Comparator.reverseOrder()).
		  forEach(System.out::println);
	}

}
