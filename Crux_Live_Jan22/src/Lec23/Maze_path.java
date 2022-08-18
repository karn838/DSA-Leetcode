package Lec23;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
		int n =5;
		printpath(m-1,n-1,0,0,"");
	}
public static void  printpath(int er,int ec,int cr,int cc,String ans) {
	//er = end row,ec = end column,cc = curr column,cr = curr row
	if(cc == ec && cr ==er) {
		System.out.println(ans+" ");
		return;
	}
	if(cc>ec || cr>er) {
		return;
	}
	printpath(er,ec,cr,cc+1,ans+"H");
	printpath(er,ec,cr+1,cc,ans+"V");
}
}
