package JavaPrograms;
import java.util.*;
public class Practice11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting number:");
	int s=sc.nextInt();
	System.out.println("enter ending number:");
	int e=sc.nextInt();
	int t=0,ld=0,fact=1,sum=0,j=0;
	int arr[]=new int[100];
	for(int i=s;i<=e;i++)
	{
		t=i;sum=0;
		while(t>0)
		{
		 ld=t%10;fact=1;
		 while(ld>0)
		 {
			fact=fact*ld; 
			ld--;
		 }
		 sum=sum+fact;
		 t=t/10;
		 }
		if(sum==i)
		{
			arr[j]=i;
			j++;
	 }
	}
	
	System.out.println("the strong numbers in the given range are:");
	for( int i=0;arr[i]!=0;i++)
	{
		System.out.println(arr[i]);
	}
	
	}
}

