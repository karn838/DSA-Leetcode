package Doubt_class3;

import java.util.Scanner;

public class Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			permutation(arr);
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
public static void permutation(int[]arr)
{
	int p=0;
	for(int i=arr.length-2;i>=0;i--)
	{
		if(arr[i]<arr[i+1])
		{
			p=i;
			break;
		}
	}
	int q=0;
	for(int i=arr.length-1;i>=0;i--)
	{
		if(arr[i]>arr[p])
		{
			q=i;
			break;
		}
	}
	if(p==0 && q==0)
	{
		reverse(arr,0,arr.length-1);
		return;
	}
	//swapping
	int temp=arr[p];
	arr[p]= arr[q];
	arr[q]=temp;
	reverse(arr,p+1,arr.length-1);
}
public static void reverse(int[]arr,int i,int j)
{
	while(i<j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
		i++;
		j--;
	}
}
}
