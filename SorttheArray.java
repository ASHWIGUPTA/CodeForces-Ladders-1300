import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SorttheArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];

		for (int j = 0; j < arr.length; j++) {
			arr[j] = scan.nextInt();
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
		int[] p = arr.clone();
		Arrays.parallelSort(p);
		/*
		 * for (int i = 0; i < p.length; i++) { System.out.println(p[i] + " ++"); }
		 */
		int c = 0;
		Node x[] = new Node[3];
		Node y[] = new Node[3];
		for (int i = 0; i < y.length; i++) {
			x[i] = new Node(0, 0);
			y[i] = new Node(0, 0);
		}
		// System.out.println(arr.length+" p "+p.length);

		for (int i = 0; i < p.length; i++) {
		//	System.out.println(p[i] + " p");
			if (p[i] != arr[i]) {
	//			System.out.println(p[i] + "&&&");
				x[c].data = p[i];
				x[c].pos = i;
				y[c].data = arr[i];
				y[c].pos = i;
				c++;
			}
			if (c >= 3) {
				System.out.println("no");
				return;
			}

		}
		// System.out.println();
		/// System.out.println(x[0] + " " + x[1] + " " + y[0] + " " + y[1]);
		if (x[0].data == y[1].data && x[1].data == y[0].data) {
			System.out.println("yes");
			if (y[0].data == y[1].data) {
				System.out.println(1 + " " + 1);

			} else {
				System.out.println(y[0].pos+1 + " " + (y[1].pos+1));
			//	System.out.println(y[1].data + " " + y[0].data);
			}
		} else {
			System.out.println("no");
		}

	}

	private static class Node {
		int data;
		int pos;

		public Node(int data, int pos) {
			this.pos = pos;
			this.data = data;
		}
	}
}
