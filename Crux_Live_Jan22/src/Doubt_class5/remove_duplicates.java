package Doubt_class5;

import java.util.Scanner;

public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		duplicate(str);
		
	}
public static void duplicate(String str)
{
	int count=1;
	char prev = str.charAt(0);
	String ans = "";
	for(int i=1;i<str.length();i++)
	{
		char curr = str.charAt(i);
		if(prev == curr)
		{
			count++;
		}
		else
		{
			ans = ans+prev;
			prev = curr;
			count=1;
		}
	}
	ans = ans+str.charAt(str.length()-1);
	System.out.println(ans);
	
}
}
