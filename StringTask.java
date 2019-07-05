import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next().toLowerCase();
		String r = "";
		for (int i = 0; i < n.length(); i++) {
			char j=n.charAt(i);
			if(j!='a'&&j!='e'&&j!='i'&&j!='o'&&j!='u'&&j!='y') {
				r+="."+j;
			}
		}
		System.out.println(r);
	}
}
