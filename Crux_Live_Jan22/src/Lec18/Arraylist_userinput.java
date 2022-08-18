package Lec18;
import java.util.*;
public class Arraylist_userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>l1 = new ArrayList<>();
		for(int i=0;i<4;i++)
		{
			l1.add(sc.nextInt());
		}
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println();
		
		
	} 

}
