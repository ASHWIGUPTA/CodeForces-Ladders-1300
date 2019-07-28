import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LearningLanguage {
	static LinkedList<Boolean>[] visited;
	static boolean []visit;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Graph g = new Graph(n+1, m+1);
		int c = -1;
		System.out.println(n+" "+m);
		for (int i = 0; i < n; i++) {
			int r=scan.nextInt();
			for (int j = 0; j < r; j++) {
				g.add(i, scan.nextInt());
			}
			System.out.println("loop "+i);
		}
		
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].size(); j++) {
				System.out.print(visited[i].get(j)+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int b : g.list[i]) {
				for (int j = 0; j < visit.length; j++) {
					System.err.print(visit[j]+" ");
				}
				System.out.println();
				if (!visit[i]) {
					dfs(i, b,n);
		
					System.out.println(i+" "+b);
			c++;}}
			
		}
		
		System.out.println(c);

		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].size(); j++) {
				System.out.print(visited[i].get(j)+" ");
			}
			System.out.println();
		}
		
	}

	private static void dfs(int i, int b,int n) {
		// TODO Auto-generated method stub
	//	visited[i].add(b, true);
	visited[i].set(b, true);
		visit[i]=true;
		for (int j = 0; j <n ; j++) {
			if(!visited[j].get(b))
				dfs(j,b,n);
		}
			for (int j2 = 0; j2 < visited.length; j2++) {
				if(!visited[i].get(j2))
					dfs(i,j2,n);
		}
	}

	static class Graph {
		int v;
		LinkedList<Integer> list[];
		

		public Graph(int v, int m) {
			super();
			this.v = v;
			list = new LinkedList[m];
			visited = new LinkedList[m];
			visit=new boolean[v];
			Arrays.fill(visit,false);
			for (int i = 0; i <m; i++) {
				list[i] = new LinkedList<Integer>();
				visited[i] = new LinkedList<Boolean>();
				for (int r=0;r<m;r++) {
					visited[i].add(false);
				}
			}
		}

		public void add(int v, int r) {
			list[v].add(r);
		}

	}
}
