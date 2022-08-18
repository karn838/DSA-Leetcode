package Lec7;

import java.util.Scanner;

public class Is_Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isarmstrong(n));

	}
	public static boolean isarmstrong(int n)
	{
		int d = countofdigit(n);
		int ans = 0;
		int temp  = n;
		while(n>0)
		{
			int rem = n%10;
			ans = (int)(ans+Math.pow(rem, d));
			n/=10;
		}
		if(ans==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int countofdigit(int n)
	{    int c = 0;
		while(n>0)
		{
			n/=10;
			c++;
		}
		return c;
	}

}
