package other;

public class subsequence_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "ABC";
		printsubsequence(ques,"");
	}

	public  static void printsubsequence(String ques, String ans) {
		// TODO Auto-generated method stub

		if(ques.length()==0)
		{
			System.out.println(ans);
			
			return;
		}

		char ch = ques.charAt(0);
		printsubsequence(ques.substring(1),ans);
		printsubsequence(ques.substring(1),ans+ch);
	}

}
