import java.util.Scanner;

public class Reverse_within_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int i = 2;
		int j=5;
		reverse(arr,i,j);
        for(int k=0;k<arr.length;k++)
        {
        	System.out.println(arr[k]);
        }
	}
public static void reverse(int[] arr,int i,int j)
{    
	if(i<j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	
}
}
