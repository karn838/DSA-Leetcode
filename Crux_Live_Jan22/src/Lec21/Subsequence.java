package Lec21;

public class Subsequence {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
	//	System.out.print("\n"+printsubseq(str,""));
	printsubseq(str,"");
	}
//public static int printsubseq(String ques,String ans) {
	//if(ques.length()==0) {
	//	System.out.println(ans);
	
	//	return 1;
	//}
	//char ch = ques.charAt(0);
	//int f1 = printsubseq(ques.substring(1),ans);
	//int f2 = printsubseq(ques.substring(1),ans+ch);
	//return f1+f2;
//}
	public static void printsubseq(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
	 printsubseq(ques.substring(1),ans);
	  printsubseq(ques.substring(1),ans+ch);
	}
}
