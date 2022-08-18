import java.util.Scanner;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
     int k =sc.nextInt(); //for number of time rotation
     rotatearray(arr,k);
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]+" ");
     }
	}
public static void rotatearray(int[]arr,int k)
{
	k=k%arr.length;
	for(int j=1;j<=k;j++) {
	int temp=arr[arr.length-1];
	for(int i=arr.length-2;i>=0;i--)
	{
		arr[i+1]=arr[i];
	}
	arr[0]=temp;}
}
}
