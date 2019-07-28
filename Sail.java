import java.util.HashMap;
import java.util.Scanner;

public class Sail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int ex = scan.nextInt();
		int ey = scan.nextInt();
		String r = scan.next();
		HashMap<Character, Integer> v = new HashMap<Character, Integer>();
		v.put('E', 1);
		v.put('N', 1);
		v.put('S', -1);
		v.put('W', -1);
		x = ex - x;
		y = ey - y;
		for (int i = 0; i < r.length(); i++) {
			char c = r.charAt(i);
			if (c == 'E' || c == 'W') {
				if (x != 0)
					x = Math.abs(x) > (Math.abs(x - v.get(c))) ? x - v.get(c) : x;
				if (x == 0 && y == 0) {
					System.out.println(i + 1);
					return;
				}
			} else {
				if (y != 0)
					y = Math.abs(y) > (Math.abs(y - v.get(c))) ? y - v.get(c) : y;
				if (x == 0 && y == 0) {
					System.out.println(i + 1);
					return;
				}
			}
		}
		System.out.println(-1);
	}
}
