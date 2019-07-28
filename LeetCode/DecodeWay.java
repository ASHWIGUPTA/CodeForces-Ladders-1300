package LeetCode;

public class DecodeWay {
public static void main(String[] args) {
 String s="226";
	
 int sb=1;
    for(int i=1;i<s.length();i++){
      System.out.println(s.charAt(i-1)-'0'+" "+sb);
    	if(((s.charAt(i-1)-'0')==2 && (s.charAt(i)-'0')<7 ) ||(s.charAt(i-1)-'0')==1 ){
            sb++;
        }
        
    }
    //return sb;
System.out.println(sb);
}

}
