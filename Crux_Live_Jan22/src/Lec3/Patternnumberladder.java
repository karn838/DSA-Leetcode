package Lec3;

import java.util.Scanner;

public class Patternnumberladder {

	public static void main(String[] args) {
		// TODO Auto-generated method s

		  Scanner sc = new Scanner(System. in );


		    int n = sc.nextInt();

		    int num = 1;

		    for (int i = 1; i <= n; i++) {

		      for (int j = 1; j <= i; j++) {

		        System.out.print(num+++" ");
		      }
		      System.out.println();
		    }
		  }
		}