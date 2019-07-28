package a;

public class MInMaxRange {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 7, 2, 3, 4, 5 };
		int min[] = new int[arr.length];
		int max[] = new int[arr.length];

		for (int f = 0; f < max.length; f++) {
			int temp = 0;
			for (int i = max.length - 1; i > f; i--) {
				if (arr[f] < arr[i]) {
				//	System.out.println("in");
					temp++;
				}
			}
			max[f] = temp;
		}
		for (int i = max.length - 1; i >= 0; i--) {
			int temp = 0;
			for (int j = 0;j< i; j++) {
				if (arr[j] < arr[i]) {
					temp++;
				}
			}
			min[i] = temp;
		}
	for (int i = 0; i < max.length; i++) {
		System.out.print(max[i]+" ");
	}
	System.out.println();
	for (int i = 0; i < max.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for (int i = 0; i < max.length; i++) {
		System.out.print(min[i]+" ");
	}
	System.out.println();
	
	}

	
}
