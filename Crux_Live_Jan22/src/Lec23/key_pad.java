package Lec23;

public class key_pad {
  static String[]key = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="12";
       printkeypad(str,"");
	}
public static void printkeypad(String ques,String ans)
{
	if(ques.length()==0)
	{
		System.out.print(ans+" ");
		return;
	}
	char ch = ques.charAt(0);
	String pressString  = key[ch-48];
	for(int i=0;i<pressString.length();i++)
	{
		printkeypad(ques.substring(1),ans+pressString.charAt(i));
	}
}
}
