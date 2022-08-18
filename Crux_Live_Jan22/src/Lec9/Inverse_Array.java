package Lec9;

import java.util.Scanner;

public class Inverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=sc.nextInt();
		}
inverse(arr,brr);
for(int i=0;i<arr.length;i++)
{
	System.out.println(brr[i]+" ");
}
	}
public static void inverse(int[]arr,int[]brr)
{
	for(int i=0;i<arr.length;i++)
	{
		brr[arr[i]] = i;
	}
}
}
