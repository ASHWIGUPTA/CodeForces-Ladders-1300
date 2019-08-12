package LeetCode;

public class HouseRobber2 {
   public static void main(String[] args) {
	int n[]= {1,1,1,2};
	System.out.println(rob(n));
}
	public static  int rob(int[] n) {
        if(n.length==0)
        	return 0;
        
        	if( n.length==1)
            return 1;
        int a[]=new int[n.length+2];
        int c[]=new int [n.length+2];
        a[2]=n[0];
        c[2]=0;
        c[3]=1;
        for(int i=3;i<a.length;i++){
              a[i]= Math.max(a[i-1],n[i-2]+Math.max(a[i-2],a[i-3]));
            System.out.println(a[i]);
            if(i!=3 && i!=a.length-1)
            c[i]=a[i-1]>=(n[i-2]+Math.max(a[i-2],a[i-3]))?c[i-1]:a[i-2]>=a[i-3]?c[i-2]:c[i-3];
            else  if(i!=3 && i==a.length-1)
                c[i]=a[i-1]>=(n[i-2]+Math.max(a[i-2],a[i-3]))?c[i-1]:a[i-2]>a[i-3]?c[i-2]:c[i-3];
            
        }
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
        System.out.println();
        for (int i = 0; i < a.length; i++) {
			System.out.print(c[i]+" ");
		}
        System.out.println();
        System.out.println(c[n.length-1]+" "+a[n.length]);
        if(c[a.length-1]==0)
            return a[a.length-2];
        else
            return a[a.length-1];
        
    }
}