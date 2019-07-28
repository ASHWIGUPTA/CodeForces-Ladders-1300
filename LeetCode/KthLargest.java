package LeetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
	public static void main(String[] args) {
		int[] arr = { 1, 2,2,2,2,3,3  ,4,4};
		int k = 3;

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		// or pass Comparator.reverseOrder()
		/*
		 * for (int i = 0; i < arr.length; i++) { pq.offer(arr[i]); }
		 */
// pop from max-heap exactly (k-1) times
		
		 for (int i = 0; i <k && i<arr.length; i++) { pq.offer(arr[i]); }
		  System.out.println("--"+pq);
	
			if (pq.size() < k) {
				int r = arr.length - 1;
				while (--r > 0) {
					pq.poll();
				}
				System.out.println(pq.peek());
				return;
			}
		
		  for (int i = k; i < arr.length; i++) {
		  if(arr[i]>pq.peek()) { pq.poll(); pq.offer(arr[i]); } }
		  System.out.println("--"+pq);
		  System.out.println(pq.peek());
		  //System.out.println("+++"+a); // } System.out.println(a.peek());
		 
		
		/*
		 * while (--k > 0) { pq.poll(); }
		 * 
		 * System.out.println(pq.peek());
		 		/*
		  PriorityQueue<Integer> a=new PriorityQueue<Integer>();
		  
		 * for (int i = 0; i <k && i<arr.length; i++) { a.offer(arr[i]); }
		 * System.out.println("--"+a); for (int i = k; i < arr.length; i++) {
		 * if(arr[i]>a.peek()) { a.poll(); a.offer(arr[i]); } }
		 * System.out.println("--"+a);
		 * 
		 * //System.out.println("+++"+a); // } System.out.println(a.peek());
		 */}
}
