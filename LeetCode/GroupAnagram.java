package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
	public static void main(String[] args) {
		String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		HashMap<String, List<String>> a = new HashMap<String, List<String>>();
		List<List<String>> list = new ArrayList<List<String>>();

		for (int i = 0; i < str.length; i++) {
			char s[] = str[i].toCharArray();
			Arrays.parallelSort(s);
			String b = new String(s);
			List<String> li = a.get(b);
			if (li == null) {
				li = new ArrayList<String>();
				//f.add(str[i]);
				a.put(b.toString(), li);
				list.add(li);
			} 
				li.add(str[i]);
			
		}

		System.out.println(list);
		//return list;
	}
}
