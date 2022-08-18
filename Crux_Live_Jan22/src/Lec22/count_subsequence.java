package Lec22;

public class count_subsequence {
         static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		//	System.out.print("\n"+printsubseq(str,""));
		//printsubseq(str,"");
		//System.out.println(count);
		System.out.println(printsubseq1(str,""));
		}


		public static void printsubseq(String ques,String ans)//using static variable
		{
			if(ques.length()==0)
			{
				System.out.println(ans);
				count++;
				return;
			}
			char ch = ques.charAt(0);
		 printsubseq(ques.substring(1),ans);
		  printsubseq(ques.substring(1),ans+ch);
		}
		//2nd way
		public static int printsubseq1(String ques,String ans) {
			if(ques.length()==0) {
				System.out.println(ans);
			
		return 1;
			}
			char ch = ques.charAt(0);
			int f1 = printsubseq1(ques.substring(1),ans);
			int f2 = printsubseq1(ques.substring(1),ans+ch);
			return f1+f2;
		}
	}
