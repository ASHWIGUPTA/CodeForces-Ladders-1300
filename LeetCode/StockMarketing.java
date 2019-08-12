package LeetCode;

public class StockMarketing {
	public static void main(String[] args) {
		int arr[] = {1,2 };
		System.out.println(maxProfit(arr));
	}

	private static int maxProfit(int[] arr) {
		int j = arr.length - 1;
		int max = 0;
		int b = 0;
		int s = 0;
		while (j > 0) {
			b = 0;
			s = 0;
			while (j - 1 > 0 && arr[j - 1] > arr[j])
				j--;
		
		if (j != 0) {
			b = arr[j];

			while (j - 1 >= 0 && arr[j - 1] < arr[j])
				j--;

			s = arr[j];
			max += b-s;          
		//	System.out.println(j);
			j--;
			if (j != 0)
				j--;
			
		}
		
	//	System.out.println(j+"-------- "+max+" "+b+"--------- "+s);
		}
		return max;
	}
}
