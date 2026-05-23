package JavaPrograms;
import java.util.*;
public class Practice12 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check whether it is strong number or not:");
		int n=sc.nextInt();
		int t=n,sum=0;
		while(t>0)
		{
			int ld=t%10;int fact=1;
			while(ld>0)
			{
				 fact=fact*ld;
				ld--;
			}
			 sum=sum+fact;
			 t=t/10;
		}
		if(sum==n)
		{
			System.out.println("it is a strong number");
		}
		else
		{
			System.out.println("it is not a strong number");
		}

	}

}
