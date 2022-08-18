package Lec9;

import java.util.Scanner;

public class reversal_algo_ratate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=3;
		rotatearray(arr,k);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void rotatearray(int[]arr,int k)
	{
		k=k%arr.length;
		int n = arr.length;
		reverse(arr,0,n-k-1);//1st n-k element ko rotate
		reverse(arr,n-k,n-1);//n-k se last tak
		reverse(arr,0,n-1);//whole array lo reverse
	}
public static void reverse(int[] arr,int i,int j)
{    
	while(i<j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	
}
}
