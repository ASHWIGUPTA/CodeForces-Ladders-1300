import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int n = scan.nextInt();

		PriorityQueue<Node> q = new PriorityQueue<Dragons.Node>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});

		TreeMap<Integer, Integer> sr = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			q.offer(new Node(scan.nextInt(), scan.nextInt()));
		}

		while (!q.isEmpty()) {
			Node r = q.poll();
	//		System.out.println("sum: "+s+" val: "+r.val+" data: "+r.data);
			if (s > r.val) {
				s += r.data;
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}

	private static class Node {
		int val;
		int data;

		public Node(int val, int data) {
			this.val = val;
			this.data = data;
		}
	}
}
