package Lec13;

import java.util.Scanner;

public class Kadane_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println(kadane(arr));
	}
public static int kadane(int[]arr)
{
	int ans= Integer.MIN_VALUE;
	int previoussum=0;
	for(int i=0;i<arr.length;i++)
	{
		previoussum+=arr[i];
		ans=Math.max(ans,previoussum);
		if(previoussum<0)
		{
			previoussum=0;
		}		
	}
	return ans;
}
}
