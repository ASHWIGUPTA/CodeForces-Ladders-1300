package Test;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayDfs {
	static HashMap<Integer, Integer> a;
	static int arr[] = { 1, 2, 3, 4, 19, 35,64,61,62,63,15,20, 16,17, 18,7,5,6 ,56,57,58,59,60};
	static int max=0;
	static HashSet<Integer> b=new HashSet<Integer>();

	public static void main(String[] args) {

		a = new HashMap<Integer, Integer>();
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
				dfs(arr[i]);
		}
		/*
		 * System.out.println(); for (Map.Entry<Integer, Integer> b : a.entrySet()) {
		 * System.out.println(b.getKey() + " " + b.getValue()); }
		 */

	System.err.println(max);
	}

	static int dfs(int p) {
		/*
		 * if(a.containsKey(-p)) return a.get(-p);
		 */if (!a.containsKey(p))
			return 0;
		
		else {
			
		a.put(p, 1 + dfs(p + 1));
		
		b.remove(p);
		b.add(-p);
		}
		int r=a.get(p);
		if(max<r)
			max=r;
		return r;
		
	}

}
