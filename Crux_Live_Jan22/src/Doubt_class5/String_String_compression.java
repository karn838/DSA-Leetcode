package Doubt_class5;

import java.util.Scanner;

public class String_String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				String str = sc.next();
				stringprint(str);
						
			}
		public static void stringprint(String str)
		{
			char prev = str.charAt(0);
			int count=1;
			String ans = "";
			for(int i=1;i<str.length();i++)
			{
				char curr  = str.charAt(i);
				if(prev==curr)
				{
					count++;
				}
				else
				{
					ans = ans+prev;
					if(count>1) {
						ans = ans+count;}
					prev = curr;
					count=1;
				
			}
			}
			ans= ans+str.charAt(str.length()-1);
			if(count>1){
                ans = ans+count;}
			System.out.println(ans);
		}
		}

