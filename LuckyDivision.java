import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LuckyDivision {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// ArrayList<Integer> a= new ArrayList<Integer>(Arrays.asList());
		Integer ar[] = { 4, 7,44,77, 47, 74, 444, 447,477, 474, 744, 747, 774, 777 };
		List<Integer> al = Arrays.asList(ar);
		int r = scan.nextInt();
		if (al.contains(r)) {
			System.out.println("YES");
			return;
		}
		for (int g : al) {
			if (r % g == 0) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
