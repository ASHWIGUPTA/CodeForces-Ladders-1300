package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeLis {
	public static void main(String[] args) {
		int ar[][] = { {1,2} ,{3,4}};
		int b[]= {5,6};
		ar=call(ar,b);
for (int i = 0; i < ar.length; i++) {
	
	System.out.println(ar[i][0]+" "+ar[i][1]);
}
	}

	static class em implements Comparable<em> {
		int v[] = new int[2];

		@Override
		public int compareTo(em o) {
			// TODO Auto-generated method stub
			return  -o.v[0]+v[0];
		}

		public em(int[] v) {
			super();
			this.v = v;
		}

		public em() {
			super();
		}

	}

	private static int[][] call(int[][] intervals, int [] t) {
		  
		if ((intervals == null || intervals.length == 0) &&( t==null||t.length==0)) {
	            return new int[0][0];
	        }
	     /*   Arrays.sort(intervals, new Comparator<int[]>() {
	            @Override
	            public int compare(int[] a, int[] b) {
	                return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
	            }
	        });*/
	        List<int[]> res = new ArrayList<>();
	        int start = t[0], end = t[1];
	        for (int[] interval : intervals) {
	            if ( interval[1]<start) {
	                res.add(new int[]{interval[0], interval[1]});
	                start = interval[0];
	                end = interval[1];
	            } else {
	                if (end <= interval[1]) {
	                    end = interval[1];
	                }
	            }
	        }
	        res.add(new int[]{start, end});
	        return res.toArray(new int[res.size()][]);
	    }}

