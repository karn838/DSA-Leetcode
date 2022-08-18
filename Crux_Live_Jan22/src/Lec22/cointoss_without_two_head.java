package Lec22;

public class cointoss_without_two_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		cointoss(n,"");
	}
public static void cointoss(int n,String ans)
{
	if(n==0)
	{
		System.out.println(ans);
		return ;		
	}
	if(ans.length()==0 || ans.charAt(ans.length()-1)!= 'H')//without two head
	{
		cointoss(n-1,ans + "H");
	}
	if(ans.length()==0 || ans.charAt(ans.length()-1)!= 'T')//without two tail
	{
		cointoss(n-1,ans + "T");
	}
}
}
