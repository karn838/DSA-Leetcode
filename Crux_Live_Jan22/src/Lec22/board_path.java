package Lec22;

public class board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println("\n"+boardpath(n,0,""));
	}
public static int boardpath(int end,int curr,String ans)
{
	if(curr==end) {
		System.out.println(ans+"");
		return 1;
	}
	if(curr>end)
	{
		return 0;
	}
	//int fp = boardpath(end,curr+1,ans+1);
	//int sp = boardpath(end,curr+2,ans+2);
	//int tp = boardpath(end,curr+3,ans+3);
	//return fp+sp+tp;
	int count=0;
	for(int i=1;i<=3;i++)
	{
		count = count+boardpath(end,curr+i,ans+i);
	}
	return count;
}
}
