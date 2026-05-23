package JavaPrograms;
import java.util.*;
public class Practice9 {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number:");
		int s=sc.nextInt();
		System.out.println("enter ending number:");
		int e=sc.nextInt();
		int t=0,p=0,j=0;
		double sum=0;
		int count=0;
		int arr[]=new int[100];
		for(int i=s;i<=e;i++)
		{    t=i;p=i;count=0;
			while(t>0)
		{
          count++;
          t=t/10;
		}
			sum=0;int ld=0;
		while(p>0)
		{
			 ld=p%10;
			 sum=sum+Math.pow(ld,count);
			 p=p/10;
		}
		if(i==sum)
		{
			arr[j]=i;
			j++;
		}
		}
		System.out.println("the armstrong numbers in the given range are:");
		for(j=0;arr[j]!=0;j++)
		{
			System.out.println(arr[j]);
		}
		
		
		
	}

}
