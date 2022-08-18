package Lec28;

import java.util.ArrayList;
import java.util.List;

public class combination_sum3 {

	public static void main(String[] args) {

	
				// TODO Auto-generated method stub
				 int[] arr = {1,2,3,4,5,6,7,8,9};
				 int target = 7;
				 int sum=3;
				List<Integer>ll= new ArrayList<>();
			     List<List<Integer>>ans = new ArrayList<>();
				printcombination(arr,target,ll,0,ans,sum);
		        System.out.println(ans);
			}
			 public static void printcombination(int[]arr,int amount,List<Integer>ll,int idx, List<List<Integer>>ans,int sum)
				{
				
					if(amount==0 && sum==0)
					{
						//System.out.println(ll);
						ans.add(new ArrayList<>(ll));
						return;
					}
					for(int i=idx;i<arr.length;i++)
					{
						if(i!=idx && arr[i]==arr[i-1]) {
							continue;
						}
						if(amount>=arr[i])
						{
							ll.add(arr[i]);
							printcombination(arr,amount-arr[i],ll,i+1,ans,sum-1);
							ll.remove(ll.size()-1);
						}
					}
				}
		}
