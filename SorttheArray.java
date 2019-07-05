import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SorttheArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];

		for (int j = 0; j < arr.length; j++) {
			arr[j] = scan.nextInt();
		}
		int[] p = Arrays.copyOf(arr, arr.length);
		Arrays.parallelSort(p);
		int c = 0;
		int x[] = new int[3];
		int y[] = new int[3];
		/*for (int i = 0; i < p.length; i++) {
		//	System.out.print(" " + p[i]);
		}*/
	//	System.out.println();

		
		for (int i = 0; i < p.length; i++) {
			if (p[i] != arr[i]) {
				x[c] = p[i];
				y[c] = arr[i];
				c++;
			}
			if (c > 3) {
				System.out.println("no");	
				return;
			}

		}
		//System.out.println();
		///System.out.println(x[0] + " " + x[1] + " " + y[0] + " " + y[1]);
		if (x[0] == y[1] && x[1] == y[0]) {
			System.out.println("yes");
		if(y[0]==y[1]) {
			System.out.println(1+" "+1);
		}else {
			System.out.println(y[1]+" "+y[0]);
		} }else {
			System.out.println("no");
		}

	}
}
