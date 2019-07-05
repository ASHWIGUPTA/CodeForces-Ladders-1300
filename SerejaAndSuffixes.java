import java.util.HashSet;
import java.util.Scanner;

public class SerejaAndSuffixes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int j = scan.nextInt();
		int m = scan.nextInt();
		int arr[] = new int[j];
		
		for (int i = 0; i < j; i++) {
			arr[i] = scan.nextInt();
		}
		HashSet<Integer> b=new HashSet<Integer>();
		for (int i = arr.length-1; i >-1; i--) {
			int f=arr[i];
//			if(!b.contains(f)) {
				b.add(f);
	//		}
			arr[i]=b.size();
		}
		for (int i = 0; i < m; i++) {
			System.out.println(arr[scan.nextInt()-1]);
		}

	}
}
