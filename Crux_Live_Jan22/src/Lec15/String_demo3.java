package Lec15;

public class String_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdef";
		System.out.println(str.charAt(5));//charAt is used to find position of element at particular index
		System.out.println(str.substring(2,6));//.substring for getting substring between beginning index to end index
		String s1 = str.substring(2,6);
		System.out.println(str.substring(1));//used for getting beginning to end of index
		System.out.println(str.substring(1,1));
		System.out.println(str.concat(s1));
	}

}
