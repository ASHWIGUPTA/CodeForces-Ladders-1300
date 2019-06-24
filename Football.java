import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Football {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b=scan.nextInt();
		
		
	HashMap<String,Integer> ab=new HashMap(); 
		for (int i = 0; i < b; i++) {
		String a=scan.next();
			if(ab.containsKey(a)) {
				ab.put(a, ((int)ab.get(a)+1));
			}else {
				ab.put(a, 1);
			}
		}
		int z=0;
		String ac="";
		for (Map.Entry<String,Integer> abc:ab.entrySet()) {
			if(abc.getValue()>z) {
				z=abc.getValue();
				ac=abc.getKey();
			}
		}
	System.out.println(ac);
	}
}
