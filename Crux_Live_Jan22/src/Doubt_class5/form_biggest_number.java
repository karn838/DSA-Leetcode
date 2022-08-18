package Doubt_class5;

import java.util.Scanner;

public class form_biggest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[]arr = new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			sort(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
	public static void sort(int[] arr)
	{
		for(int pass = 1;pass<arr.length;pass++)
		{
			for(int i=0;i<arr.length-pass;i++)
			{
				if(compare(arr[i],arr[i+1])>0)
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
	}
public static int compare(int x1,int x2)
{
	String s1 = ""+x1+x2;
	String s2 = ""+x2+x1;
	if(Long.parseLong(s2)>Long.parseLong(s1)) {
		return 1;
	}
	else {
		return -1;
	}
}
}
