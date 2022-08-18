 package Lec22;
import java.util.*;
public class generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3;
        //parenthesis( n,0, 0,"");
        List<String>list = new ArrayList<>();
        parenthesis( n,0, 0,"",list);
        System.out.println(list);
        
	}
public static void parenthesis(int n,int opening,int closing,String ans,List<String>list)
{ 
	if(opening == n && closing == n) {
		
		//System.out.println(ans);
		list.add(ans);
		return;
	}
	if(opening<n) {
		parenthesis(n,opening+1,closing,ans+"(",list);
	}
	if(closing<opening) {
		parenthesis(n,opening,closing+1,ans+")",list);
	}
}
}
