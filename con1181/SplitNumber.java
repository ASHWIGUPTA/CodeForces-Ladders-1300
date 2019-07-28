package con1181;

import java.util.Scanner;

public class SplitNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int z=(x+1)/2;
	String y=scan.next();
	System.out.println(Integer.parseInt(y.substring(0, z))+ Integer.parseInt(y.substring(z)));
	
	}
}
