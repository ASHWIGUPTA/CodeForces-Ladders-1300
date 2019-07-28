package a;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            String[] arr_L = br.readLine().split(" ");
            int[] L = new int[Q];
            for(int i_L=0; i_L<arr_L.length; i_L++)
            {
            	L[i_L] = Integer.parseInt(arr_L[i_L]);
            }
            String[] arr_R = br.readLine().split(" ");
            int[] R = new int[Q];
            for(int i_R=0; i_R<arr_R.length; i_R++)
            {
            	R[i_R] = Integer.parseInt(arr_R[i_R]);
            }

            long[] out_ = solve(A, R, L);
            System.out.print(out_[0]);
            for(int i_out_=1; i_out_<out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static long[] solve(int[] A, int[] R, int[] L){
        // write your code here
    long sum =0;
    int len=A.length;
    if(len==0)
    return null;
  
    long []sums =new long [len+1];
    sums[0]=0;
    for(int i=0;i<A.length;i++){
    sum=sum+A[i];
    sums[i+1]=sum;
    }
    sum=0;
    long []left =new long [len+1];
    left[len]=0;
    for(int i=A.length-1;i>=0;i--){
    sum=sum+A[i];
    left[i]=sum;
    }
    int s=0;
    long []result =new long [R.length]; 
    for(int i=0;i<R.length;i++){
        int diff =R[i]-L[i]+1;
        int carry =diff%len;
        int rem=diff/len;
        int last=(L[i]-1)%len;
        int start=(R[i]-1)%len;
        System.out.println(start+" "+last+" "+sum+" "+carry+" "+rem+" ");
        long su= sum*rem;
        if(carry!=0){
            int min=Math.min(last, start);
            int max=Math.max(last, start);
        	
            if(last<= start) {
            	 for(int h=min;h<=max;h++) {
             		su=su+A[h];
             	} 	
            }
            else {
            	 for(int h=0;h<=last;h++) {
              		su=su+A[h];
              	}
            	 for(int h=start;h<len;h++) {
               		su=su+A[h];
               	}
            }
            System.out.println("*** "+su+" "+" end "+" "+min+" "+max);
        	
        }
        result[i]=su;
    }
    return result;
    }
    /*
     * 1
1
3
4 1 5
3
1 3 9
4 7 10      
     */
    
}