package Lec16;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String str = "aaabbccds";
	  System.out.println(stringcom(str));
	}
public static int stringcom(String str)
{
	int count =0;
	int res=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==(str.charAt(+1)))
		{
			count++;
			res +=str.charAt(i)+ count;
		}
		else {
			count=0;
			i++;
		}
		
	}
	return res;
}
}
