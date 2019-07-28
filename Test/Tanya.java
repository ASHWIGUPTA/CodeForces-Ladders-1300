package Test;

import java.util.StringTokenizer;

public class Tanya {
	public static void main(String[] args) {

		String A = "my name is Tanya  ";

		StringTokenizer st = new StringTokenizer(A, " ");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

		/*
		 * StringBuilder sb = new StringBuilder(""); int t = 0;
		 * 
		 * for (int i = 0; i < A.length(); i++) { if (A.charAt(i) == ' ') { t =
		 * sb.length() != 0 ? sb.length() : t; sb = new StringBuilder(""); } else {
		 * sb.append(A.charAt(i)); } }
		 * 
		 * // System.out.println("StringTokenizer Example: \n");
		 * 
		 * 
		 * System.out.println(sb.length() == 0 ? t : sb.length());
		 */
	}
}
