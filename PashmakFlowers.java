import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PashmakFlowers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		
		long[] arr = new long[(int) n];
		TreeMap<Long, Long> a = new TreeMap();

		for (int i = 0; i < arr.length; i++) {
			Long r = scan.nextLong();
			if (a.containsKey(r)) {
				a.put(r, (a.get(r) + 1));
			} else {
				a.put(r, (long) 1);
			}
		}
		Long r = a.lastKey() - a.firstKey();
		if (r == 0) {
			
			System.out.println(r + " " + (n*(n-1))/2);
			return;
		}
		for (Map.Entry<Long, Long> v : a.entrySet()) {
			if (a.containsKey(r + v.getKey())) {
				System.out.println(r + " " + a.get(r + v.getKey()) * v.getValue());
				break;
			}

		}
	}
}