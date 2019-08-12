import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int z = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.parallelSort(a);
		z=z*8;
		int k=z/n;
		int d=1<<k;
		TreeMap<Integer, Integer> m=new TreeMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i],m.get(a[i])+1);
			}
			else
				m.put(a[i],1);
		}
		int e = m.size();
		long max=0;
		long sum=0;
		int r=d;
		long v=m.get(m.firstKey());
		for(Map.Entry<Integer, Integer> b:m.entrySet()) {
			
			if(r>0) {
				sum+=b.getValue();
			r--;
			}
		}
		max=sum;
		
for(Map.Entry<Integer, Integer> b:m.entrySet()) {
			sum-=v;
				sum+=b.getValue();
	
}
		
	}
}
