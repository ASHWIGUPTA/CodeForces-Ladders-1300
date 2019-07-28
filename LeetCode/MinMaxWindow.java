package LeetCode;

public class MinMaxWindow {
	public static void main(String[] args) {
		int arr[] = { 1 };
		int r = 1;
		int j = min(arr, 0, arr.length - 1, r);
		System.out.println(j);
		int y = max(arr, 0, arr.length - 1, r);
		System.out.println(y);
	}

	private static int min(int[] arr, int i, int length, int r) {
		// TODO Auto-generated method stub

		int mid = (i + length) / 2;
				
		if (i > length || i < 0)
			return -1;
		
		if ((arr[mid] == r && mid == 0) || (arr[mid] == r && arr[mid - 1] < r))
			return mid;
		if (arr[mid] >= r)
			return min(arr, i, mid - 1, r);
		else
			return min(arr, mid + 1, length, r);
	}

	private static int max(int[] arr, int i, int length, int r) {
		int mid = (i + length) / 2;

		if (i > length || i < 0)
			return -1;
		if ((arr[mid] == r && mid == length) || (arr[mid] == r && arr[mid + 1] > r))
			return mid;
		if (arr[mid] > r)
			return max(arr, i, mid - 1, r);
		else
			return max(arr, mid + 1, length, r);
	}

}
