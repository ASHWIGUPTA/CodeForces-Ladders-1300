	import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class JeffPeriods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = "";
		int ar[] = new int[n];
		TreeMap<Integer, Node> a = new TreeMap<Integer, Node>();

		for (int i = 0; i < n; i++) {
			int r = scan.nextInt();
			if (!a.containsKey(r)) {
				a.put(r, new Node(i, 0));
			} else {
				Node o = a.get(r);
				if (o.diff == 0) {
					a.put(r, new Node(i, i - o.i));
				} else if (i - o.i != o.diff) {
					a.put(r, new Node(i, Integer.MAX_VALUE));
				} else {
					a.put(r, new Node(i, i - o.i));
				}
			}

		} int c = 0;
		for (Map.Entry<Integer, Node> b : a.entrySet()) {
			if (b.getValue().diff == Integer.MAX_VALUE)
				c++; // a.remove(b.getKey());
		}
		System.out.println(a.size() - c);
		for (Map.Entry<Integer, Node> b : a.entrySet()) {
			if (b.getValue().diff != Integer.MAX_VALUE)
				System.out.println(b.getKey() + " " + (b.getValue().diff));
		}

	}

}

class Node {
	int i;
	int diff;
	int data;

	public Node(int i, int j) {
		this.diff = j;

		this.i = i;
	}
}
