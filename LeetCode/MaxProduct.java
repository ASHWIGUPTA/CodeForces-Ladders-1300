package LeetCode;

public class MaxProduct {
	public static void main(String[] args) {

		int arr[] = { -2,0,-1};
		int min = Integer.MIN_VALUE;
		int pro = 1;
		if (arr.length == 1)
			// return arr[0];
			return;
		int m = 1;
		for (int i = 0; i < arr.length; i++) {
			if (pro > 0)
				pro = pro * arr[i];
			else
				pro = arr[i];
			
			if (pro < 0 &&min!=0) {
				int j = arr[i];
				pro = pro * m;
				m = pro ;
				if (pro < 0)
					pro = arr[i];
			}
			if (min < pro) {
				min = pro;
			}

			System.out.println(min + " " + pro+" "+m);
		}
		System.out.println(min);
	}
}
