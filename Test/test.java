package Test;

public class test {
	public static void main(String[] args) {
System.out.println(reverseWords("my name us ashwani"));
	}

	public static String reverseWords(String a) {
		String str = "";
		int flag = 1, end = 0;
		for (int i = a.length() - 1; i >= 0; i--) {
			if (i == 0) {
				str += a.substring(i, end);
			}
			if (a.length() == 1) {
				str += a.substring(i, 1);
			}
			if (a.charAt(i) == ' ') {
				str += a.substring(i + 1, end) + " ";
				flag = 1;
				end = i;
			} else {
				if (flag == 1) {
					end = i + 1;
					flag = 0;
				}
			}
		}

		return str;

	}
}