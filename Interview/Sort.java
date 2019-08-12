package Interview;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort {
	public static void main(String[] args) {
		String a = "aabbbc";//{ 1, 2, 2, 1, 1, 1, 2, 4, 53, 2 };
		
		TreeMap<Character, Integer> b = new TreeMap<Character, Integer>();
		
		for (int i = 0; i < a.length(); i++) {
			int c = b.getOrDefault(a.charAt(i), 0);
			b.put(a.charAt(i), c + 1);

		}
		/*
		 * for (Map.Entry<Integer, Integer> c : b.entrySet()) {
		 * System.out.println(c.getKey() + " " + c.getValue()); }
		 */
		LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();

		b.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

	StringBuilder r=new StringBuilder();
	for (Map.Entry<Character, Integer> c : sortedMap.entrySet()) {
			for (int i = 0; i < c.getValue(); i++) {
			r.append(c.getKey());
			}
		}
	System.out.println(r.toString());

	}
}
