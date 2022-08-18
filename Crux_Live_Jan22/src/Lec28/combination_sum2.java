package Lec28;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class combination_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10,1,2,7,6,1,5};
		 int target = 8;
		 Arrays.sort(arr);
		List<Integer>ll= new ArrayList<>();
	     List<List<Integer>>ans = new ArrayList<>();
		printcombination(arr,target,ll,0,ans);
        System.out.println(ans);
	}
	 public static void printcombination(int[]arr,int amount,List<Integer>ll,int idx, List<List<Integer>>ans)
		{
			if(amount==0)
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
					printcombination(arr,amount-arr[i],ll,i+1,ans);
					ll.remove(ll.size()-1);
				}
			}
		}
}
