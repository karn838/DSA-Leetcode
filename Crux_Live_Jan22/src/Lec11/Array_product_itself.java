package Lec11;

import java.util.Scanner;

public class Array_product_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] ans = arrayprodduct(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(ans[i]);
		}
}
	public static int[] arrayprodduct(int arr[])
	{
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0]=1;
		for(int i=1;i<n;i++)
		{
			left[i]=left[i-1]*arr[i-1];
		}
		right[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			right[i]=right[i-1]*arr[i-1];
		}
		for(int i=0;i<right.length;i--)
		{
			arr[i]=left[i]*right[i];
		}
		return arr;
	}
	}