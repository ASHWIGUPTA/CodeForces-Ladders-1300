package LeetCode;

public class MinWindow {
	public static void main(String[] args) {
		String s = "ABDEEBCTBA";
		String t = "ABC";
		int x=0,y=0,z=10000000;
		int a[] = new int[26];
		for (int i = 0; i < t.length(); i++) {
			a[t.charAt(i)-'A']++;
		}
		
		int l=0,h=0;
		int[] b = new int[26];
		while(l<=h && h<=s.length()) {
			//System.out.println(l+" "+h+" "+z);
			if(check(b,a)) {
			 	if(h-l < z) {
					z = h-l; x=l;y=h-1;
				}
				b[s.charAt(l)-'A']--;
				l++;
			} else {
				if(h<s.length())
					b[s.charAt(h)-'A']++;
				h++;
			}
		}
		System.out.println(s.substring(x,y+1));

	}
	
	public static boolean check(int[] p, int[] q) {
		for (int i = 0; i < q.length; i++) {
		}
		for(int i=0;i<p.length;i++) {
			if(p[i]<q[i]) {
				return false;
			}
		}
		return true;
	}
}
