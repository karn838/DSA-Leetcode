import java.util.Scanner;

public class Alexa_goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated meSthod stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price = new int[n];
		for(int i=0;i<price.length;i++)
		{
			price[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		while(q-->0)
		{
			int A=sc.nextInt();
			int K = sc.nextInt();
		
     if(istrue(price,A,K)==true)
{
	System.out.println("Yes");
}
     else
     {
    	 System.out.println("No");
     }
	}}
public static boolean istrue(int[]price,int A,int K)
{
	int count=0;
	for(int i=0;i<price.length;i++)
	{
		if(A%price[i]==0)
		{
			count++;
		}
	}
	if (count>=K)
			{
		return true;
			}
	else
	{
		return false;
	}
}
}
