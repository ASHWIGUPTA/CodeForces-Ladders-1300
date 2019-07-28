import java.util.Scanner;

public class HungrysSequence {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int r=scan.nextInt();
	StringBuilder b=new StringBuilder("");
	for (int i = 0; i < r; i++) {
		b.append((r<<1)+i+" ");
	}
	System.out.println(b.toString().trim());
}
}
