package JavaPrograms;
import java.util.*;
/* 1 2 3
 * 4 5 6
 * 7 8 9
 */
public class Practice2 {
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of rows:");
	int r=sc.nextInt();
	System.out.println("enter no of columns:");
	int c=sc.nextInt();
	int k=1;
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{   
		 System.out.printf("%-4d",k);//for perfect spacing even for 2 digit numbers
			k++;
        }
		System.out.print("\n");
    }

	
}
}
