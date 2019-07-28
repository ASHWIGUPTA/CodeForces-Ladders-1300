package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.text.StyledEditorKit.BoldAction;

class Graph {
	private LinkedList<Integer> add[];
	private int V;
	boolean[] visited;
	int[] countPath;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		this.V = v;
		add = new LinkedList[v];
		countPath = new int[v];
		for (int i = 0; i < add.length; i++) {
			add[i] = new LinkedList<Integer>();
		}
	}

	public void add(int v, int e) {
		// System.out.println(v+" "+e);
		add[v].add(e);
		countPath[v]++;
		countPath[e]++;

	}

	public void printDfs(int a, String g) {

		System.out.print(a + "--> ");
		visited[a] = true;

		for (Integer r : add[a]) {
			if (!visited[r]) {
				printDfs(r, "");
			}
		}

	}

	public void minHeight() {

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < countPath.length; i++) {
			if (countPath[i] == 1) {
				q.add(i);
			}
		}
		System.out.println(q.size());
		int c = V;

		while (c > 2) {
System.out.println("inc " +c);
			for (int i = 0; i < q.size(); i++) {
				int r = q.poll();
				c--;
				for (int j : add[r]) {
					countPath[j]--;
					if (countPath[j] == 1) {
						q.add(j);
						System.out.println(q.peek());
					}
				}
			}

		}
		while (!q.isEmpty())
			System.out.println(q.poll());
	}

	public void printPath(int a) {
		boolean[] visited = new boolean[V];

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(a);
		visited[a] = true;
		while (!q.isEmpty()) {

			int p = q.poll();
			System.out.print(p + "--> ");
			for (Integer r : add[p]) {
				if (!visited[r]) {
					q.add(r);

				}
			}
		}

	}

	public void printLevelNode(int a, int lavel) {
		boolean[] visited = new boolean[V];
		int[] la = new int[V];

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(a);
		visited[a] = true;
		int c = 0;
		while (!q.isEmpty()) {

			int p = q.poll();
			for (Integer r : add[p]) {
				if (!visited[r]) {
					la[r] = la[p] + 1;
					q.add(r);
				}
			}
		}
		for (int i = 0; i < la.length; i++) {
			System.out.println(i + " lavel " + la[i] + " ");
			if (la[i] == lavel) {

				c++;
			}
		}
		System.out.println(c + " ---------");

	}

	public void printDfs(int i) {
		// TODO Auto-generated method stub
		boolean[] visited = new boolean[V];
		printDfs(i, "");
	}

	public int findForest() {
		visited = new boolean[V];
		Arrays.fill(visited, false);
		int v = 0;
		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				printDfs(i, "");
				v++;
			}

		}
		return v;
	}

	public void findMother() {
		visited = new boolean[V];
		Arrays.fill(visited, false);
		int v = 0;
		int c = 0;
		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				printDfs(i, "");
				v = i;
				c++;
			}
		}
		System.out.println("forest " + c);
		Arrays.fill(visited, false);
		printDfs(v);
		System.out.println("v " + v);
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}

	public int pathBetween(int i, int j) {
		int c = 0;
		if (i == j) {
			return 1;
		}
		visited[i] = true;
		for (Integer r : add[i]) {
			if (!visited[r]) {
				c += pathBetween(r, j);
			}
		}
		return c;
	}

}

public class GraphStart {
	public static void main(String[] args) {

		Graph a = new Graph(6);
		a.add(0, 1);
		a.add(0, 2);

		// a.add(0, 3);
		a.add(2, 3);
		a.add(3, 4);
		a.add(2, 5);
		// a.add(4, 3);

		a.visited = new boolean[6];
//	System.out.println(	a.pathBetween(0, 3));
		a.minHeight();
//		a.printLevelNode(0, 2);
		// a.add(1, 2); a.add(2, 0); a.add(2, 3); a.add(3, 3); a.add(3, 1); a.add(1, 3);
		// a.add(1, 0);
		// System.out.println("--forest " + a.findForest());
		// a.printPath(2);
		// System.out.println();
		// a.printDfs(0);
		// System.out.println();
		// a.findMother();
		// System.out.println("------0-");
	}

}
