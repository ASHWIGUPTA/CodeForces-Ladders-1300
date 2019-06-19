import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	String []k=scan.next().replace("+", " ").split(" ");
	Arrays.sort(k);
	for (int i = 0; i < k.length-1; i++) {
		System.out.print(k[i]+"+");
	}System.out.println(k[k.length-1]);

	}
}
