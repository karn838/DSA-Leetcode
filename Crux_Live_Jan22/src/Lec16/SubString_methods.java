package Lec16;

public class SubString_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "abcd";
		pringsubstring(str);
	}
public static void pringsubstring(String str)
{
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<=str.length();j++)
		{
			System.out.println(str.substring(i,j));
		}
	}
}
}
