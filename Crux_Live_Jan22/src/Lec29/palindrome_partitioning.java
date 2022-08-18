package Lec29;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		String str = "nitin";
		palindrome_partitioning(str,list,ans);
		System.out.println(ans);
				
	}
	public static void palindrome_partitioning(String ques,List<String>list,List<List<String>>ans) {
		if(ques.length()==0)
		{
			//System.out.println(ans);
		   ans.add(new ArrayList<String>(list));
		}
		for(int i=1;i<=ques.length();i++)
		{
			String s = ques.substring(0,i);
			if(ispalindrome(s)) {
				list.add(s);
			palindrome_partitioning(ques.substring(i),list,ans);
			list.remove(list.size()-1);
			}
		}
	}
	public static boolean ispalindrome(String s)
	{
		int i=0;
		int j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
