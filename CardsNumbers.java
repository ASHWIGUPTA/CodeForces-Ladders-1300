import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class CardsNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int arr[] = new int[5001];
		int ar[] = new int[5001];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2 * n; i++) {
			int r = Integer.parseInt(st.nextToken());
			if (arr[r] == 0) {
				arr[r] = i + 1;
			} else if (arr[r] > 0 && ar[r] == 0)
				ar[r] = i + 1;
			else {
				sb.append("-1");
				bw.write(sb.toString());
				bw.close();

				return;
			}
			String r="".indexOf("d")
		}
		for (int i = 0; i < ar.length; i++) {
			if (arr[i] > 0 && ar[i] == 0) {
				sb.append(-1);
				bw.write(sb.toString());
				bw.close();

				return;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (arr[i] > 0 && ar[i] > 0) {
				sb.append(arr[i] + " " + ar[i] + "\n");
			}
		}
		bw.write(sb.toString());
		bw.close();

	}
}
