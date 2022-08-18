import java.util.Scanner;

public class Palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		palindromesubstring(str);
	}
public static void palindromesubstring(String str)
{
	for(int i=0;i<str.length();i++)
	{
		for(int j = i+1;j<=str.length();j++)
		{
			String s1 = str.substring(i,j);
			if(ispalindrome(s1)==true) {
				System.out.println(s1);
			}
		}
	}
}
public static boolean ispalindrome(String s)
{
	int i=0;
	int j=s.length()-1;
	while(i<j)
	{
		if(s.charAt(i)!=s.charAt(j))
		{
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
