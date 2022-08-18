package Lec19;

public class Maximum_sum_of_window_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		System.out.println(maximumsum(arr,k));
	}
public static int maximumsum(int[]arr,int k){
	int sum=0;
	//1st first window
	for(int i=0;i<k;i++)
	{
		sum+=arr[i];
	}
	int ans = sum;
	for(int i=k;i<arr.length;i++)
	{
		sum+=arr[i];//window grow
		sum-=arr[i-k];//window small
		ans = Math.max(ans, sum);//ans update
	}
	return ans;
}}
