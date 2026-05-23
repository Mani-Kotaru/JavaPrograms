package JavaPrograms;
import java.util.*;
public class Practice6 {
//
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting value(>1):");
	int s=sc.nextInt();
	System.out.println("enter ending value:");
	int e=sc.nextInt();
    int count,prime=0;
    System.out.println("prime numbers between "+s+" and "+e+" are:");
    int n=s,j=0;
     int[] arr=new int[100];
	while((n>=s)&&(n<=e))
	{  count=0;
		for(int i=1;i<=n;i++)
		{
			if((n%i)==0)
			count++;
		}
		if(count==2)
		{
          arr[j]=n;
          j++;
		}
		n++;
	}
	//int t=arr.length;
	for(int i=0;i<j;i++)
	{
		System.out.println(arr[i]);
	}
	}

}
