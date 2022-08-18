package Lec21;

public class first_occurenece {
     public static void main(String[] args) {
    	 int[]arr = {0,1,2,3,4,5,3,};
	System.out.println(firstoccurence(arr,0,3));
}
     public static int firstoccurence(int[]arr,int i,int item)
     {
    	 if(i==arr.length) {
    		 return -1;
    	 }
    	 if(arr[i]==item) {
    		 return i;
    	 }
    	 return firstoccurence(arr,i+1,item);
     }
}
