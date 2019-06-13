import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UltraFastMathematician {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String p=scan.next();
		String n=scan.next();
		String w="";
		for(int i=0;i<p.length();i++) {
			if(p.charAt(i)==n.charAt(i)) {
				w=w+"0";
			}else {
				w=w+"1";
			}
		}
		System.out.println(w);
	}
}
