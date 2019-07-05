import java.util.Scanner;

public class Letter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine().replace(" ", "");
		String o = scan.nextLine().replace(" ", "");
		int arr[] = new int[255];
		for (int i = 0; i < n.length(); i++) {
			char b = n.charAt(i);
			arr[b] = arr[b] + 1;
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.print(arr[i]+" "); }
		 * 
		 */
		for (int i = 0; i < o.length(); i++) {
			char b = o.charAt(i);
		//	System.out.println(arr[b] + " " + b);
			if (arr[b] == 0) {
				System.out.println("NO");
				return;
			} else {
				arr[b]--;
			}
		}
		System.out.println("YES");
	}
}
