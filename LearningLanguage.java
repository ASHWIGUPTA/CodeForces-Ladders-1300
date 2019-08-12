import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class LearningLanguage {
	static LinkedList<Boolean>[] visited;
	static boolean[] visit;
	static LinkedList<Integer> list[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
	//	System.out.println(n + " " + m);
		list = new LinkedList[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < n; i++) {
			int r = scan.nextInt();
			for (int j = 0; j < r; j++) {
				list[i].add(scan.nextInt());
			}
		//	System.out.println("loop " + i);
		}

		Stack<Integer> b = new Stack<Integer>();
		boolean[] vis = new boolean[n];
		int cv=-1;
		for (int i = 0; i < vis.length; i++) {
			if (vis[i] == false) {
				for (int j = 0; j < list[i].size(); j++) {
					b.add( list[i].get(j));
				}
				vis[i] = true;
				while (!b.isEmpty()) {
					int c = b.pop();
			//	System.out.println(c.arr[0]+" "+c.arr[1]);
					for (int j = 0; j < vis.length; j++) {
						if (vis[j] == false && list[j].contains(c)) {
							for (int y = 0; y < list[j].size(); y++) {
								b.add( list[j].get(y));
							}
							vis[j]=true;

				//		System.out.println(cv);
						}
					}

				}
			
				cv++;
			}	
			}
		if(cv==n-1) {
		for (int i = 0; i < vis.length; i++) {
			if(list[i].size()>0)
				{System.out.println(cv);
				return;}
		}
		System.out.println(cv+1);
		}else
			System.out.println(cv);
		
			/*
			 * for (int i = 0; i < visited.length; i++) { for (int j = 0; j <
			 * visited[i].size(); j++) { System.out.print(visited[i].get(j)+" "); }
			 * System.out.println(); }
			 * 
			 * for (int i = 0; i < n; i++) { for (int b : g.list[i]) { for (int j = 0; j <
			 * visit.length; j++) { System.err.print(visit[j]+" "); } System.out.println();
			 * if (!visit[i]) { dfs(i, b,n);
			 * 
			 * System.out.println(i+" "+b); c++;}}
			 * 
			 * }
			 * 
			 * System.out.println(c);
			 * 
			 * for (int i = 0; i < visited.length; i++) { for (int j = 0; j <
			 * visited[i].size(); j++) { System.out.print(visited[i].get(j)+" "); }
			 * System.out.println();
			 */}

	

/*	static class X {
		int arr[] = new int[2];

		public X(int ar, int y) {
			super();
			arr[0] = ar;
			arr[1] = y;

		}
*/
	//}

	/*
	 * private static void dfs(int i, int b,int n) { // TODO Auto-generated method
	 * stub // visited[i].add(b, true); visited[i].set(b, true); visit[i]=true; for
	 * (int j = 0; j <n ; j++) { if(!visited[j].get(b)) dfs(j,b,n); } for (int j2 =
	 * 0; j2 < visited.length; j2++) { if(!visited[i].get(j2)) dfs(i,j2,n); } }
	 * 
	 * static class Graph { int v; LinkedList<Integer> list[];
	 * 
	 * 
	 * public Graph(int v, int m) { super(); this.v = v; list = new LinkedList[m];
	 * visited = new LinkedList[m]; visit=new boolean[v]; Arrays.fill(visit,false);
	 * for (int i = 0; i <m; i++) { list[i] = new LinkedList<Integer>(); visited[i]
	 * = new LinkedList<Boolean>(); for (int r=0;r<m;r++) { visited[i].add(false); }
	 * } }
	 * 
	 * public void add(int v, int r) { list[v].add(r); }
	 * 
	 * }
	 */}
