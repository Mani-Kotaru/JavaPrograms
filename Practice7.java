package JavaPrograms;

import java.util.Scanner;

public class Practice7 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number to check whether it is prime or not:");
			int n=sc.nextInt();
			while((n!=1)&&(n!=0))
			{
			 int count=0;
			for(int i=1;i<=n;i++)
				{
			      if(n%i==0)
			    	  count++;
				}
			if(count==2)
			{
				System.out.println(n+"is prime number");
			}
			System.out.println(n+"is not a prime number");
			System.out.println("enter a number to check whether it is prime or not(enter 0 or 1 to exit):");
			n=sc.nextInt();
		}

	}

}
