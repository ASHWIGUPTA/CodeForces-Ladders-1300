import java.util.Scanner;

public class Bit {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int x=0;
for (int i = 0; i < n; i++) {
	String z=scan.next();
	if(z.contains("++")) {
		x++;
	}else if(z.contains("--")) {
		x--;
	}
}
System.out.println(x);
}
}
