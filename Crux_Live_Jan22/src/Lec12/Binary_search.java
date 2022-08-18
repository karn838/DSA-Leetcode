package Lec12;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		System.out.println(binarysearch(arr,item));
	}
public static int binarysearch(int[]arr,int item)
{
	int lo=0;
	int hi=arr.length-1;
	while(lo<=hi)
	{	int mid=(lo+hi)/2;
		if(arr[mid]==item)
		{
			return mid;
		}
		else if(arr[mid]>item)
		{
			hi=mid-1;
		}
		else
		{
			lo=mid+1;
		}
	}
	return -1;
}
}