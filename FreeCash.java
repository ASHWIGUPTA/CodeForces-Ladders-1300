import java.util.Collection;
import java.util.Scanner;
import java.util.TreeMap;

public class FreeCash {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int j = scan.nextInt();
		TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		for (int i = 0; i < j; i++) {
			String r = scan.nextInt() + " " + scan.nextInt();
			if (t.containsKey(r)) {
				t.put(r, t.get(r) + 1);
			} else {
				t.put(r, 1);
			}
		}
		// int max=0;

		Collection<Integer> r = t.values();
		// b=(TreeSet<Integer>) b.descendingSet();
		int z = 0;

		for (Integer f : r) {
			if (z < f)
				z = f;
		}
		System.out.println(z);
		/*
		 * for (Map.Entry<String, Integer> g:t.entrySet()) { if(g.g) }
		 */

	}
}
