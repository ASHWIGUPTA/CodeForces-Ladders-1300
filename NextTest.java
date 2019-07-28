import java.util.Arrays;
import java.util.Scanner;

public class NextTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		Arrays.parallelSort(ar);
		int l=1;
		for (int i = 0; i < ar.length ; i++) {
			if (ar[i]  !=l) {
				System.out.println(l);
				return;
			}
	
//System.out.println(ar[i]  !=l);
l++;	}
		System.out.println(l);
	}
}
