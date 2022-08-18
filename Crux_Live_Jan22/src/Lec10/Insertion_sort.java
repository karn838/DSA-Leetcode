package Lec10;

import java.util.Scanner;

public class Insertion_sort {

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

for(int i=1;i<arr.length;i++)
{
	int j=i-1;
	int item=arr[i];
	while(j>=0 && arr[j]>item)
	{
		arr[j+1]=arr[j];
		j--;
	}
	j++;
	arr[j]=item;
}
		
	}
	}
