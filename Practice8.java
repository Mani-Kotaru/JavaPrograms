package JavaPrograms;
import java.util.*;
public class Practice8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	  System.out.println("enter starting number(greater than 10):");
	  int s=sc.nextInt();
	  System.out.println("enter ending number:");
	  int e=sc.nextInt();
	  int arr[]=new int[100];
	  int j=0;
	  for(int i=s;i<=e;i++)
	  {
		  int t=i,sum=0;
		  while(t>0)
		  {  
			  int l=t%10;
			  sum=sum*10+l;
			  t=t/10;
		  }
		  if(i==sum)
		  {
			  arr[j]=i;
			  j++;
		  }
	}
	  System.out.println("the palindromes in the given range are:");
	  for(int i=0;arr[i]!=0;i++)
	  {
		 System.out.println(arr[i]);
	  }

   }
}
