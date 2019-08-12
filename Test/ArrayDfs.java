package Test;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayDfs {
	
	static int max=0;
	
	static HashSet<Integer> b=new HashSet<Integer>();

	public static void main(String[] args) {
		int arr[] = { 100, 4, 200, 1, 3, 2};
	
		HashMap<Integer, Integer> 	a = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			a.put(arr[i], 1);
			b.add(arr[i]);
		}

		/*
		 * for (Map.Entry<Integer, Integer> b : a.entrySet()) {
		 * System.out.println(b.getKey() + " " + b.getValue()); }
		 */
		for (int i = 0; i < arr.length; i++) {
			if(b.contains(arr[i]))
				dfs(arr[i],a);
		}
		/*
		 * System.out.println(); for (Map.Entry<Integer, Integer> b : a.entrySet()) {
		 * System.out.println(b.getKey() + " " + b.getValue()); }
		 */

	System.err.println(max);
	}

	static int dfs(int p, HashMap<Integer, Integer> a) {
		/*
		 * if(a.containsKey(-p)) return a.get(-p);
		 */if (!a.containsKey(p))
			return 0;
		
		else {
			
		a.put(p, 1 + dfs(p + 1,a));
		
		b.remove(p);
		b.add(-p);
		}
		int r=a.get(p);
		if(max<r)
			max=r;
		return r;
		
	}

}
