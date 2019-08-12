import java.util.Scanner;
import java.util.Stack;

public class FlagDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	String a = scan.next();
		int n = scan.nextInt();
		int r = scan.nextInt();
		Stack<Integer> s = new Stack();
		int a[] = new int[n];
		for (int i = 0; i < r; i++) {
			int y = scan.nextInt() - 1;
			int x = scan.nextInt() - 1;
			int z = scan.nextInt() - 1;
//			int in = 0;
			if(a[x]!=0){
					a[y]=a[x]%3+1;
					a[z]=a[y]%3+1;
				}
				else if(a[y]!=0){
					a[z]=a[y]%3+1;
					a[x]=a[z]%3+1;
				}
				else{
					if(a[z]==0)a[z]=1;
					a[x]=a[z]%3+1;
					a[y]=a[x]%3+1;
				}
			}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}


}