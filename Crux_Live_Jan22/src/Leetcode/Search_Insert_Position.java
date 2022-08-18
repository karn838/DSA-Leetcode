package Leetcode;

import java.util.Scanner;

public class Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(SearchInsertPosition(arr,target));
		
	}
public static int SearchInsertPosition(int[]arr,int target)
{
	int lo = 0;
	int hi = arr.length-1;
	while(lo<hi)
	{
		int mid = (lo+hi)/2;
		if( arr[mid]== target)
		{
			return mid;
			
		}
		else if(arr[mid]>target)
		{
			hi = mid-1;
		}
		else
		{
			lo = mid+1;
		}
	}
	if(arr[lo] >= target) return lo;
    else return lo + 1;
}
}
