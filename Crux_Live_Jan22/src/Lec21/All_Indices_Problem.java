package Lec21;

import java.util.Scanner;

public class All_Indices_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		allindex(arr,0,item);
	}
public static void  allindex(int[]arr,int i,int item)
{   
	if(i==arr.length && arr.length!=item) {
		return ;
	}
	if(arr[i]==item)
	{
		System.out.print(i+" ");
	
	}
	allindex(arr,i+1,item);
}
}

