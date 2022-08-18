package Lec32;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {7,3,2,1,5,7,1};
		int[]ans = mergesort(arr,0,arr.length-1);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
}
	public static int[]  mergesort(int[]arr,int lo,int hi)
	{
		if(lo==hi)
		{
			int[]a = new int[1];
			a[0]=arr[lo];
			return a;
		}
	int mid = (lo+hi)/2;
	int[]fs = mergesort(arr,lo,mid);
	int[]ss = mergesort(arr,mid+1,hi);
	return mergesorted_array(fs,ss);
 		
	}
	private static int[] mergesorted_array(int[] fs, int[] ss) {
		// TODO Auto-generated method stub
		int n  = fs.length;
		int m=  ss.length;
		int[]ans = new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m)
		{
			if(fs[i]<=ss[j])
			{
				ans[k]=fs[i];
				i++;
				k++;
			}
			else {
				ans[k]=ss[j];
				j++;
				k++;
			}}
			while(i<n)
			{
				ans[k]=fs[i];
				i++;
				k++;
			}
			while(j<m)
			{
				ans[k]=ss[j];
				j++;
				k++;
			}
		return ans;
		
}}