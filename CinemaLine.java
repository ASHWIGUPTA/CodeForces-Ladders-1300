import java.util.PriorityQueue;
import java.util.Scanner;

public class CinemaLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int f25 = 0, f50 = 0, f100 = 0;
		int fail = 0;
		for (int i = 0; i < n; i++) {
			int r = scan.nextInt();
			switch (r) {
			case 25:
				f25++;
				break;
			case 50:
				if (f25 > 0) {
					f25--;
					f50++;
				} else
					fail++;
				break;
			case 100:
				if (f50 > 0 && f25 > 0) {
					f50--;
					f25--;
				} else if (f25 >= 3) {
					f25 = f25 - 3;
				} else {
					fail++;
				}
				break;

			}
		//	System.out.println(f25 + " " + f50);
		}
		if (fail > 0) {
			System.out.println("NO");
		} else
			System.out.println("YES");

		/*
		 * switch (r) { case 25: q.offer(r); break; case 50: if (!q.isEmpty() &&
		 * q.contains(25)) { q.remove(25); q.add(50); } else { System.out.println("NO");
		 * return; } break;
		 * 
		 * case 100: if (!q.isEmpty() && q.contains(25)) { if (q.contains(50) &&
		 * q.contains(25)) { q.remove(25); q.remove(50); q.offer(r); } else { int j = 0;
		 * while (j++ < 3 && q.contains(25)) { q.remove(25); } if (j != 3) {
		 * System.out.println("NO"); return; } q.offer(r);
		 * 
		 * } } else { System.out.println("NO"); return; } break; }
		 */ }
}
