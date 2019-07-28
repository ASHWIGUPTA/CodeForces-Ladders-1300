import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class RomaChangingSigns {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		// TreeSet<Integer> t=new TreeSet<Integer>();
//	ArrayList<Integer> t=new ArrayList<Integer>();
		Integer[] t = new Integer[n];
		for (int i = 0; i < n; i++) {
			t[i] = scan.nextInt();
		}
//	Collections.sort(t);
		long sum = 0;
		int r = k / n;
		// k=k%n;
		int z = 0;
		boolean flag = false;
		for (int i = 0; i < t.length; i++) {
			// System.out.println(nv);
			if (t[i] < 0) {
				t[i] = -1 * t[i];
				k--;
			}
			

		}
Arrays.parallelSort(t);
		if(k%2==1)
			t[0]=t[0]*-1;
		for (int i = 0; i < t.length; i++) {
		sum+=t[i];
		}
		System.out.println(sum);
	}
}
