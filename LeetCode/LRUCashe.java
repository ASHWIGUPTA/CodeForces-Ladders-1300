package LeetCode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LRUCashe {
	public static void main(String[] args) {

	}

	public static class LRUCache {
		Queue<Integer> q;
		LinkedHashMap<Integer, Integer> map;
		int size;

		public LRUCache(int capacity) {
			q = new LinkedList();
			map = new LinkedHashMap<Integer, Integer>();
			size = capacity;
		}

		public int get(int key) {
			Object r = map.get(key);
				if (r != null) {
					map.put(key,map.get(key));
					q.remove(key);
					q.offer(key);
					return (int) r;
				}else
				return -1;
		}

		public void put(int key, int value) {
			if (map.size() == size && !map.containsKey(key)) {
			
				map.remove(q.poll());
			}else if(map.containsKey(key)) {
				q.remove(key);
			}
			map.put(key, value);
			q.offer(key);
		}
	}
}
