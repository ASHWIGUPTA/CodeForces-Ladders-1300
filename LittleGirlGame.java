import java.util.Scanner;

public class LittleGirlGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int a[]=new int[27];
	for (int i = 0; i < s.length(); i++) {
		int b=s.charAt(i)-'a';
		a[b]++;
	}
	int su=0;
	for (int i = 0; i < 27; i++) {
//		System.out.print(a[i]+" ");
		if(a[i]%2!=0) {
			su++;
		}
	}
//	System.out.println(su);
	if((su>0 &&su%2!=0) ||su==0) {
		System.out.println("First");
	}else {
		System.out.println("Second");
	}
	}
}
