package Lec19;

import java.util.Scanner;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	    System.out.println(countsubarray(arr, k));
	}
public static int countsubarray(int[]arr,int k)
{
	int si=0;
	int ei =0;
	int ans=0;
	int p=1;
	while(ei<arr.length)
	{
		//window grow
		p = p*arr[ei];
		//window shrink
		while(p>=k && si<=ei)
		{
			p=p/arr[si];
			si++;
		}
		ans = ans + ei-si+1;
		ei++;
	}
	return ans;
}
}
