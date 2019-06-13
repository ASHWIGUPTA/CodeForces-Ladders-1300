import java.util.Scanner;

public class BeautifulYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int j = ++p;
		while (true) {
		
			boolean visited[] = new boolean[10];
			while (p != 0) {
				if (visited[p % 10]) {
					break;}
				visited[p % 10] = true;
				p = p / 10;
			}
			if (p == 0) {
				System.out.println(j);
				break;
			} else
				j++;
			p=j;
		}
	}
}
