package Lec28;

import java.util.ArrayList;
import java.util.List;

public class combination_leetcode77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int n=2;
		List<Integer>ll= new ArrayList<>();
	    List<List<Integer>>ans = new ArrayList<>();
		queen(board,n,0,0,ll,ans);
		System.out.println(ans);
	}
	public static void queen(boolean[] board,int tq,int qpsf,int idx,List<Integer>ll,List<List<Integer>>ans) {
		//tq-->total queen 
		//qpsf-->queen place so far
		if(tq==qpsf)
		{
			//System.out.println();
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx;i<board.length;i++)
		{
			if(board[i]==false) {//queen place nhi hai
				board[i]=true;
				ll.add(i+1);
				queen(board,tq,qpsf+1,i+1,ll,ans);
				ll.remove(ll.size()-1);
			    board[i]=false;
			}
		}
	}
}
