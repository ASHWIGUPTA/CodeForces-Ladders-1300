import java.util.HashMap;
import java.util.Scanner;

public class Borze {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String n=scan.next();
	HashMap<String , Integer> map=new HashMap<String, Integer>();
	map.put(".", 0);
	map.put("-.", 1);
	map.put("--", 2);
	String re="";
	int i;
	String p="";
	for (i = 0; i < n.length();i++ ) {
		p=p+n.charAt(i);
		if(map.containsKey(p)) {
			re=re+map.get(p);
			p="";	
		}
	}		
	System.out.println(re);
	

}}
