package LeetCode;

public class CountAndSay {
public static void main(String[] args) {
	int n=5;
	StringBuilder r= new StringBuilder("1");
	//String q="";
	StringBuilder q= new StringBuilder();
	
	for (int i = 1; i < 7; i++) {
	
		for (int j = 0; j < r.length(); j++) {
			char c=r.charAt(j);
			int f=1;
		//	if((j+1)<r.length())
	//		System.out.println(c==r.charAt(j+1));
			while((j+1)<r.length() && c==r.charAt(j+1)) {
				f++;
				j++;
			}
			q=q.append(f).append(c-48);
//			System.out.print("<--"+j+"--> "+q+" "+f);
		}
		r=q;
		q=new StringBuilder();
	//	System.out.println();
		//System.out.println(i+"--> "+r);
	}
	System.out.println(r);
}
}
