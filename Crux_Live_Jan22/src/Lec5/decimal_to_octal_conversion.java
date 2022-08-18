package Lec5;

import java.util.Scanner;

public class decimal_to_octal_conversion {

	static void octaltodecimal(int deciNum)

    {

        int octalNum = 0, countval = 1;

        int dNo = deciNum;

        while (deciNum != 0) {
 

          

            int remainder = deciNum % 8;
 

        

            octalNum += remainder * countval;
 

         

            countval = countval * 10;

            deciNum /= 8;

        }

        System.out.println(octalNum);

    }
 

    public static void main(String[] args)

    {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 

        octaltodecimal(n);

	}

}
