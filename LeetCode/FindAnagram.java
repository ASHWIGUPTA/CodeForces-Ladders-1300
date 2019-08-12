package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagram {
	public static void main(String[] args) {
		String s = "abab";
		String p = "ab";
		int a[] = new int[26];
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < p.length(); i++) {
			a[p.charAt(i) - 'a']++;
		}
		int b[] = new int[26];
		int l = 0, h = p.length() ;
		for (int i = 0; i < p.length(); i++) {
			b[s.charAt(i) - 'a']++;
		}
	
		while (l <= h && h <= s.length()) {
			if (check(b, a)) {
				list.add(l);
			}
			b[s.charAt(l) - 'a']--;
			if(h<s.length())
			b[s.charAt(h) - 'a']++;

			l++;
			h++;
	}
		System.out.println(list);

	}

	public static boolean check(int[] p, int[] q) {
		for (int i = 0; i < q.length; i++) {
		}

		for (int i = 0; i < p.length; i++) {
			if (p[i] < q[i] || p[i] > q[i]) {
				return false;
			}
		}
		return true;
	}
}
