package Leetcode;

import java.util.Scanner;
import java.util.*;

public class Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]nums = new int[n];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println(ContainsDuplicate(nums));
	}
public static boolean ContainsDuplicate(int[]nums)
{
	
	 Arrays.sort(nums);
     for(int i=0;i<nums.length-1;i++)
     {
         if(nums[i]==nums[i+1])
             return true;
     }
     return false;
 }
}
