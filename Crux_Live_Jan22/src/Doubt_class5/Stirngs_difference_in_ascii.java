package Doubt_class5;

import java.util.Scanner;

public class Stirngs_difference_in_ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Ascii_codes(str);
	}
public static void Ascii_codes(String str)
{    
	String ans="";
	char prev = str.charAt(0);
	for(int i=1;i<str.length();i++)
	{
		char curr = str.charAt(i);
		ans = ans+prev+(curr-prev);
		prev = curr;
	}
	ans = ans+prev;
	System.out.println(ans);
}
}
