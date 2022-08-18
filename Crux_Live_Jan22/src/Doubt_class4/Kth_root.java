package Doubt_class4;

import java.util.Scanner;

public class Kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			long n = sc.nextLong();
			int k = sc.nextInt();
		}
	
	}
public static int kthroot(long n,int k)
{
	long lo =1;
	long hi = n;
	long ans = 0;
	while(lo<=hi)
	{
		long mid = lo+(hi-lo)/2;
		if(Math.pow(mid, k)<=n)
		ans = mid;
		lo = mid+1;
	}
}
}
