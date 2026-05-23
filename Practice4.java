package JavaPrograms;
import java.util.*;
public class Practice4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value:");
	int n=sc.nextInt();
	int i,j=0,k=1;
	for(i=0;i<n;i++)
	{
		for(j=0;j<=i;j++)
		{   
		 System.out.printf("%-4d",k);//for perfect spacing even for 2 digit numbers
		 k++;
        }
		System.out.print("\n");
    }
	for(i=n-1;i>0;i--)
	{
		for(j=0;j<i;j++)
		{
			System.out.printf("%-4d",k);
			k++;
		}
		System.out.println();
	}

}
}
