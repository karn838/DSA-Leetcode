package other;

import java.util.Scanner;

public class infosys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<1;)
		{
			for(int j=i+1;i<2;)
			{
				int c = (j-i);
				int tot = arr[j]*arr[j];
				int b = c+tot;
				
				System.out.println(b);
				return;
			}
			
		}
		
}}