package InterviewBit;

import java.util.ArrayList;

public class test2 {
public static void main(String[] args) {
	ArrayList<Integer> b=new ArrayList<Integer>();
	b.add(1);
	System.out.println(firstMissingPositive(b));
}
public static int firstMissingPositive(ArrayList<Integer> A) {
    int b[]=new int[A.size()+1];
   
   for(int x:A){
   if(x>-1 && x<=A.size()){
       b[x]=1;
   }    
   }
   /*for(int i=0;i<b.length;i++){
       System.out.print(b[i]+" ");
   }*/
   int r=0;
   for(int i=1;i<b.length;i++){
       if(b[i]==0)
       { break;}
        else{
            r++;
        }
   }
   return r+1;
   
    }
}
