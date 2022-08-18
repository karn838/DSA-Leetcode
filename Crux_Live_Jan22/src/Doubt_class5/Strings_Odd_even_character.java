package Doubt_class5;

import java.util.Scanner;

public class Strings_Odd_even_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		oddeven(str);
	}
public static void oddeven(String str)
{
	String ans ="";
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(i%2==0)
		{
			ans = ans+(char)(ch+1);
		}
		else
		{
			ans = ans+(char)(ch-1);
		}
	}
	System.out.println(ans);
}
}
