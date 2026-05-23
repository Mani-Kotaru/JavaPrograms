package JavaPrograms;
import java.util.*;
//   printing pattern  * * *
//                       * *
//                         *

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int j=0;
		for(int i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{  
			 System.out.print("  ");
			 }
			for(int k=j;k<n;k++)
			{
			System.out.print(" "+"*");
	     	}
			System.out.println();
	    }

	}
}

