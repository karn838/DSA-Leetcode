import java.util.Scanner;

public class Sourse_destination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      int src=sc.nextInt();
	      int des=sc.nextInt();
	      int num=sc.nextInt();
	      int multiplier=1;
	      //logic
	      //base 8 to base 10 conversion
	      int dec=0;{
	      while(num>0) {
	          //divide by base 10
	          int rem=num%10;
	          num/=10;
	          //multiply by power of src=base 8
	          int value=rem*multiplier;
	          //adding the values
	          dec+=value;
	          multiplier*=src;//changes(use src which you get as input)
	      }
	      //base 10 to base 2
	      int bin=0;
	      multiplier=1; 
	      while(dec>0) {
	          int rem=dec%des;//changes(use des which you got as input)
	          dec=dec/des;//changes(use des which you got as input)
	          //mul by 10
	          int value=rem* multiplier;
	          //adding values
	          bin =bin +value;
	          multiplier*=10;
	      }
	      System.out.println(bin);
	}}}