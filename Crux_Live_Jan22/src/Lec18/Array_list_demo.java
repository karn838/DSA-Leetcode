package Lec18;
import java.util.*;

public class Array_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list = new ArrayList<>();
		System.out.println(list);
		//add :- last se add krega
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		//add at index
		//range 0 to size
		list.add(2, 30);
		System.out.println(list);
		System.out.println(list.size());
		
		//delete:-range of delete is size-1
		System.out.println(list.remove(1));
		System.out.println(list);
		list.add(40);
		list.add(50);
		System.out.println(list);
		//get range is 0 to size-1
		System.out.println(list.get(0));
		//update at index
		//set is used
		list.set(1, 123);
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list);
		//enhance for loop
		for(int var:list) {
			System.out.print(var+" ");
		}
		System.out.println();
		Collections.sort(list);
		//2D array
		//int[][]a = new int[2][3];
		//for(int[]a1:a) {
		//	for(int i:a1)
		//	{
		//		System.out.println(i);
		//	}
		//}
		
	}

}
