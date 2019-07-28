package LeetCode;

public class LongestMountain {
	public static void main(String[] args) {
		int ar[] = {2,3,3,2,0,2/* 1,2, 1, 2, 3, 4, 3, 2, 1, 4, 5, 6, 6 */};
		System.out.println(mountian(ar));
	}

	private static int mountian(int[] ar) {
		// TODO Auto-generated method stub
		int c = 0;
		boolean flag = true;
		
		int max=0;
		for (int i = 0; i < ar.length-1; i++) {
			if (ar[i] < ar[i + 1]) {
				if (flag)
				{	c++;
				
				}else {
					c = 1;
					flag = true;
				}
			}
			else if(ar[i] > ar[i + 1]) {
				if(c!=0) {
					c++;
					if(max<c)
						max=c;
					flag=false;
				
			}
		}
		else {
			c=0;
		}
		}	
		return max>0?max+1:0;
	}
}
