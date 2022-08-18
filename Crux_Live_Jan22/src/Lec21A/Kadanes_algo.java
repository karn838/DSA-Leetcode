package Lec21A;

public class Kadanes_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {-11,-12,2,3,-3,7,-3};
		System.out.println(maxsubarraysum(arr));
	}
public static int maxsubarraysum(int[]arr) {
	int ans = Integer.MIN_VALUE;
	int curr_sum=0;
	for(int i=0;i<arr.length;i++) {
		curr_sum+=arr[i];
		ans = Math.max(curr_sum,ans);
		if(curr_sum<0) {
			curr_sum=0;
		}
	}
	return ans;
}
}
