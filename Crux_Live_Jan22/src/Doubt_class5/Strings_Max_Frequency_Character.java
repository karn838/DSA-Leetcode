package Doubt_class5;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Frequency_Character(str);
	}
public static void Frequency_Character(String str)
{
	int[]freq = new int[26];
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		freq[ch-97] = freq[ch-97]+1;
	}
	int max_index=0;
	for(int i=0;i<freq.length;i++)
	{
		if(freq[i]>freq[max_index])
		{
			max_index=i;
		}
	}
	char ch = (char)(97+max_index);
	System.out.println(ch);
}
}
