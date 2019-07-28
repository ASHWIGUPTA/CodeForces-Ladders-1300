import java.util.Scanner;

public class LiyaAndQueries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n=scan.next();
		Integer arr[]=new Integer[n.length()];
		arr[0]=0;
		for (int i = 1; i < arr.length; i++) {
			if(n.charAt(i)==n.charAt(i-1)) {
				arr[i]=arr[i-1]+1;
			}else
				arr[i]=arr[i-1];
		}
		int q=scan.nextInt();
		for (int i = 0; i < q; i++) {
			int l=scan.nextInt()-1;
			int r=scan.nextInt()-1;
		//	if(l!=0)
				System.out.println(arr[r]-arr[l]);
			/*
			 * else System.out.println(arr[r]);
			 */}
	}
}