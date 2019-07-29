package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	//a.add(0);
//	long r[]= {, , -, -
	//Arrays.asList(a) , -,, , 
	a.add(756898537);a.add(-1973594324);a.add( -2038664370);a.add(-184803526);
	a.add(1424268980);
	ArrayList<Integer> r=maxset(a);
	for (int b:r) {
		System.out.print(b+" ");
		
	}
}
 public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
    long max=Long.MIN_VALUE,sum=0;;
    int l=0,h=-1,t=0,r=0;
    for(int i=0;i<A.size();i++){
        if(A.get(i)<0){
            t=i+1;
            sum=0;
        }else{
            sum+=A.get(i);
            r=i;
            if(max<sum ||max<=sum && (h-l)<(r-t))
                 max=sum;
                   h=r;
                   l=t;
				} 
					//  else if(max<sum) { max=sum; h=r; l=t; }
					 
               
           System.out.println(sum+" "+h+" "+l);
        }
    //}
  //  System.out.println(l+" "+h);
	/*
	 * ArrayList<Integer> b=new ArrayList<Integer>(); for(int i=l;i<h+1;i++){
	 * b.add(A.get(i)); }
	 */
    return null;
        
    }



}
