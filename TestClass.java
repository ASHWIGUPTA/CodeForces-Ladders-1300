import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
		}
		Graph g =new Graph(N+1);
		for (int i = 0; i < N - 1; i++) {
			int U = sc.nextInt();
			;
			int V = sc.nextInt();
			g.addEdge(U , V );
		}
		System.out.print(g.dfs(arr,arr[0], K));
	}

	public static class Graph {
		public boolean visited[];
		int V;
		LinkedList<Integer> al[];

		public Graph(int v) {
			this.V = v;
			al=new LinkedList[v];
			for (int i = 0; i < v; i++) {
				al[i] = new LinkedList();
			}
		}

		void addEdge(int v, int w) {
			al[v].add(w);
}

		int dfs(int []arr,int v, int k) {
			int sum = v;
			int pre=v;
			visited = new boolean[V];
			return dfsutill(arr,1, k, sum,pre);
		}

		int dfsutill(int[]arr,int v, int k, int sum,int pre) {
			int c = 0;
			visited[v] = true;
			for (int i : al[v]) {
			if (!visited[i]) {
					sum = sum + arr[i-1];
					if (sum > k) {
						c++;
						c+=dfsutill(arr,i, k,  arr[i-1],pre);
					}else {
					c+=	dfsutill(arr,i, k, sum,pre);
					}
					}
			}
			return c;
		}

	}

}

