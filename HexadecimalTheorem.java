import java.util.Scanner;

public class HexadecimalTheorem {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
		/*
		 * if(n==0||n==2) { System.out.println("I'm too stupid to solve this problem");
		 * return; } if(n==0) { System.out.println(+" "+1+" "+1); return; }
		 */
	if(n==0) { System.out.println(0+" "+0+" "+0); return; }
	
if(n==1) { System.out.println(0+" "+0+" "+1); return; }
	int x=1;
int y=0;
while(n!=x) {
	int t=x;
	x=x+y;
y=t;
}
System.out.println((2*x-3*y)+" "+(2*y-x)+" "+y);
}
}
