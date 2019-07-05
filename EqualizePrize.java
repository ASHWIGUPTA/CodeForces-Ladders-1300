import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EqualizePrize {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int size = scan.nextInt();
			int k = scan.nextInt();
			int arr[] = new int[size];
			for (int j = 0; j < size; j++) {
				arr[j] = scan.nextInt();
			}
			Arrays.sort(arr);
			// Array.reverse(arr,);
			/*
			 * for (int j = 0; j < arr.length; j++) { System.out.print(" "+arr[j]); }
			 */
			int r = arr[arr.length - 1] - k;
			if (r == 0) {
				//System.out.println(k + arr[0]);	
				int z=k;
				while(true) {
					z++;
					if((arr[0]-z)<=k && (arr[arr.length-1]-z)>=k) {
						
					}else {
						
						break;
					}
					System.out.println(z+"------"+arr[0]+" "+arr[arr.length-1]+" "+((arr[0]-z)<=k)+" "+((arr[arr.length-1]-z)<=k));
				Thread.sleep(1000);
				}
				System.out.println(z);
			
			} else if (Math.abs(r - arr[0]) > k) {
				System.out.println(-1);
			} else {
				System.out.println(arr[arr.length - 1] - k);
			}
		}
	}
}
