package Lec23;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		printpermutation(s,"");
	}
public static void printpermutation(String ques,String ans)
{    
	if(ques.length()==0) {
		System.out.println(ans);
		return ;
	}
	for(int i=0;i<ques.length();i++)
	{
		String ros = ques.substring(0,i)+ques.substring(i+1);
		char ch = ques.charAt(i);
		printpermutation(ros,ans+ch);
	}
}
}
