import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int r=scan.nextInt();
		long[] arr=new long[r];
		long[] c=new long[r];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		c=arr;
		Arrays.sort(arr);
		long ac[]=new long[3];
		long ab[]=new long[3];
		int co=0;
		for (int i = 0; i < c.length; i++) {
			if(arr[i]!=c[i]) {
				ab[co]=arr[i];
				ac[co]=c[i];
				co++;
			}
			if(co>2) {
				System.out.println("NO");
			}
		}
	}
}
