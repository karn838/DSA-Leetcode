package Lec19;

import java.util.Scanner;

public class Kartik_bhaiya_and_strings {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();
		int flipa = maximumlength(str,k,'a');
		int flipb = maximumlength(str,k,'b');
		System.out.println(Math.max(flipa, flipb));
		
	}
public static int maximumlength(String str,int k,char ch)
{
	int si=0;
	int ei =0;
	int ans=0;
	int flip = 0;
	while(ei<str.length()) {
		if(str.charAt(ei)==ch) {
			flip++;
		}
		while(flip>k && si<=ei) {
			if(str.charAt(si)==ch) {
				flip--;
			}
			si++;
		}
		ans = Math.max(ans, ei-si+1);
		ei++;
	}
return ans;

}
}
