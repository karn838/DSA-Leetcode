package Lec22;

public class cointoss {
     static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		cointoss(n,"");
		System.out.println(count);
	}
public static void cointoss(int n,String ans)
{
	if(n==0) {
		System.out.println(ans);
		count++;
		return ;
	}
	cointoss(n-1,ans+"H");
	cointoss(n-1,ans+"T");
	
}
}
