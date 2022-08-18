package Lec29;

public class string_partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		String ans="";
		string_partitioning(str,ans);
	}
public static void string_partitioning(String ques,String ans) {
	if(ques.length()==0)
	{
		System.out.println(ans);
	
	}
	for(int i=1;i<=ques.length();i++)
	{
		string_partitioning(ques.substring(i),ans+ques.substring(0,i)+"|");
		
	}
}
}
