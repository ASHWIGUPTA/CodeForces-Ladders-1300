import java.util.Scanner;

public class PetyaStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n=scan.next();
		String k=scan.next();
		System.out.println(n.compareToIgnoreCase(k)>0?1:n.compareToIgnoreCase(k)==0?0:-1);
	}
}
