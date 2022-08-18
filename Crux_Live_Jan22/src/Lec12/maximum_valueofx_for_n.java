package Lec12;

import java.util.Scanner;

public class maximum_valueofx_for_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int item = sc.nextInt();
		System.out.println(forx(arr,n));
	}
public static int forx(int[]arr,int item)
{   
	int lo=0;
	int hi=arr.length;
	int ans=0;
	while(lo<hi)
	{
		int mid=(lo+hi)/2;
		if(mid*mid<=item)
		{
			ans=mid;
			lo=mid+1;
		}
		else
		{
			hi=mid-1;
		}
	}
	return ans;
}
}
