package Lec22;

public class dice_roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println("\n"+diceroll(n,0,""));
		
	}
public static int diceroll(int end,int curr,String ans)
{
	if(curr==end)
	{
		System.out.println(ans+"");
		return 1;
	}
	if(curr>end) {
		return 0;
	}
	int count=0;
	for(int dice=1;dice<=6;dice++)
	{
		count = count+diceroll(end,curr+dice,ans+dice);
	}
	return count;
}
}
