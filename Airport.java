import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Airport {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int n = scan.nextInt();

		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> min = new PriorityQueue<Integer>();

		for (int i = 0; i < n; i++) {
			int z = scan.nextInt();
			min.offer(z);
			q.offer(z);
		}
		int sum = 0;
		// System.out.println(q.);
		int m=0;
		while (s != 0 && !q.isEmpty()) {
			int r = q.poll();
			int f=min.poll();
			m+=f;
			sum += r;
			if(f!=1)
				min.offer(f-1);
			if (r != 1)
				q.offer(r - 1);
			s--;
		}
		System.out.println(sum+" "+m);
	}
}
