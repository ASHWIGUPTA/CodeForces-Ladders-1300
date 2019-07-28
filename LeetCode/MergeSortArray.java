package LeetCode;

public class MergeSortArray {
	public static void main(String[] args) {
		int n = 6;
		int m = 3;
		int nums1[] = {-1,0,0,3,3,3,0,0,0 };
		int nums2[] = { 1,2,2};
		
		
		int p = 0;
		for (int i = 0; i < n; i++) {
			for (int j = p; j < nums1.length; j++) {
			//	System.out.println(nums2[i]+" fir "+nums1[j]+" "+m+" i is "+i+" j is "+j);
				
				if (nums2[i] <= nums1[j] ) {
				//	System.out.println(nums2[i]+" fir "+nums1[j]+" "+m+" i is "+i+" j is "+j);
					for (int k = m ; k > j; k--) {
						nums1[k] = nums1[k - 1];
					}
					m++;
					nums1[j] = nums2[i];
					break;
				//continue;
						}
				else if(j>m && nums1[j]==0) {
					nums1[j]=nums2[i];
				break;
				}
				p=j;
				
			}
			}
	//		System.out.println("hii"+ i+" "+nums2[i]+"hi   j ");
		for (int j = 0; j < nums2.length; j++) {
			System.out.print(nums2[j]+" ");
		}
		}
	}


