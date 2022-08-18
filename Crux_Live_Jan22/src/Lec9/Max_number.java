package Lec9;

import java.util.Scanner;

public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     System.out.println(max(arr));
}
	public static int max(int[]arr) 
	{
		int maxi=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(maxi<arr[i]) {
				maxi=arr[i];
			}
		
		}
		return maxi;
		}
	}