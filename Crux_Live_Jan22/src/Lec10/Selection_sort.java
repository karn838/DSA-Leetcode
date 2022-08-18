package Lec10;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0;i<arr.length;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     sort(arr);
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
		}
	public static void sort(int[] arr)
	{

for(int i=0;i<arr.length;i++)
{
	int min=i;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[j]<arr[min])
		{
			min=j;
		}
	}
	int temp=arr[i];
	arr[i]=arr[min];
	arr[min]=temp;
}
	}
	}

