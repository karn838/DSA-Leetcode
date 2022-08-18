package Lec26;

public class queen_permuitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int n=2;
		queen(board,n,0,"");
	}
public static void queen(boolean[] board,int tq,int qpsf,String ans) {
	//tq-->total queen 
	//qpsf-->queen place so far
	if(tq==qpsf)
	{
		System.out.println(ans);
		return;
	}
	for(int i=0;i<board.length;i++)
	{
		if(board[i]==false) {//queen place nhi hai
			board[i]=true;
			queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
		    board[i]=false;
		}
	}
}
}
