package JavaPrograms;
import java.util.*;//gcd of two numbers by identifying greatest factor which is common in both numbers
public class Practice17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int j=0,i=0,k=0,max=0,l=0,m=0;
	int arr[]=new int[100];
	int arr1[]=new int[100];
	int arr2[]=new int[100];
	for(i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			arr[j]=i;
			j++;
		}
	}
	for(i=1;i<=b;i++)
	{
		if(b%i==0)
		{
			arr1[k]=i;
			k++;
		}
	}
	
	for(i=0;i<j;i++)
	{
		for(m=0;m<k;m++)
		{
	  if(arr[i]==arr1[m])
		{
			arr2[l]=arr[i];
			l++;
		}
	  }
	}
	max=arr2[0];
	for(i=1;i<l;i++)
	{
		if(arr2[i]>max)
		{
			max=arr2[i];
		}
		
	}
	
	System.out.println("gcd of two numbers:"+max);

	}

}

