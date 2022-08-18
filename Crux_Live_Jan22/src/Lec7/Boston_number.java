package Lec7;
import java.util.*;
public class Boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   int a = sc.nextInt();
		   if(sumofdigit(a)==BostonNo(a)){
		       System.out.println("1");
		   }
		   else{System.out.println("0");}
		   
		    }
		    public static int sumofdigit(int n)
		    {
		        int sum=0;
		        while(n>0)
		        {
		            int rem = n%10;
		            sum=sum+rem;
		            n/=10;
		        }
		        return sum;
		    }
		    public static int BostonNo(int n)
		    {
		        int sum = 0;
		        int fact = 0;
		        for(int i=2;i<=n;++i)
		        {
		            while(n%i==0)
		            {
		                sum+=sumofdigit(i);
		                n/=i;
		            }
		        }
		        return sum;
		    }
		//    public static int prime_no(int n)
		 //   {
		 //       int fact = 0;
		 //       for(int i=2;i<n;i++)
		  //      {
		   //         if(n%i==0)
		   //         {
		    //            fact++;
		   //         }
		     //   }
		     //   if(fact==0)
		     //   {
		     //       return 1;
		    //    }
		   //     return 0;
		  // }
		}