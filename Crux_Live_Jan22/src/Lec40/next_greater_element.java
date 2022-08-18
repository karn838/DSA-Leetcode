package Lec40;

import java.util.Stack;

public class next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {11,2,3,23,9,13,14,15};
		nge(arr);
	}
public static void nge(int[]arr) {
	int[]nge = new int [arr.length];
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<arr.length;i++) {
    	while(!st.isEmpty()&& arr[i]>arr[st.peek()]) {
    		int ii=st.pop();
    		nge[ii]=arr[i];
    	}
    	st.push(i);
    }
    while(!st.isEmpty()) {
    	int ii=st.pop();
    	nge[ii]=-1;
    }
    for(int i=0;i<nge.length;i++) {
    	System.out.println(arr[i]+" "+" "+nge[i]);
    }
}
}
