package a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagram {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		Scanner scan = new Scanner(System.in);
		a.add("anagram");
		a.add("aaagrnm");
		a.add("code");
		a.add("ram");
		a.add("eodc");
		
		System.out.println("abc".compareTo("abx"));
		
		TreeMap<String, String> ab = new TreeMap<String, String>();
		for (String b : a) {
			char c[] = b.toCharArray();
			Arrays.parallelSort(c);
			String r = "";
			System.out.println(r);
			for (int i = 0; i < c.length; i++) {
				r = r + c[i];
			}
			System.out.println(r);

			if (ab.containsKey(r) && ab.get(r).compareTo(b) > 0) {
				ab.put(r, b);
			} else if (!ab.containsKey(r)) {
				ab.put(r, b);
			}

		}
		for (Map.Entry<String, String> v : ab.entrySet()) {
			System.out.println(v.getKey() + " " + v.getValue());
		}
		System.out.println();
		ArrayList<String> abc = new ArrayList<String>();
		for (String f : ab.values()) {
			abc.add(f);
		}
		// return ab.values();
	}
}
