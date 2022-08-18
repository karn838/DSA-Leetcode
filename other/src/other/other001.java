package other;

public class other001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<=n;i++)
		{
			if(i==0)
			{
				System.out.println(1);
			}
			else if(i==1 || i==n)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(0);
			}
		}
	}

}
