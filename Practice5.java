package JavaPrograms;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int r=sc.nextInt();
		System.out.println("enter no of columns:");
		int c=sc.nextInt();
		int j=0;
		for(int i=0;i<r;i++)
		{
			for( j=0;j<=i;j++)
			{ 
			 System.out.print(" "+"*");
			}
			for(int k=j;k<c;k++)
			{
			 System.out.print(" "+"@");
	        }
			System.out.print("\n");
	    }

	}

}
