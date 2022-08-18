package Lec9;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[]arr  = new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println(min(arr));
	}
	public static int min(int[]arr)
	{
		int mini = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(mini>arr[i])
			{
				mini = arr[i];
			}
		}
		return mini;
	}
}