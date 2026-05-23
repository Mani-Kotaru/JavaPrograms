package JavaPrograms;
import java.util.*;//sum of digits in an array upto single digit
public class Practice26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of array:");
	int n=sc.nextInt();
	int arr[]=new int[100];
	int sum=0,sum1=0,temp=0,ld=0;
	System.out.println("enter elements into the array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum=sum+arr[i];
	}
	while(true)
   {
	for(int i=0;i<10;i++) {
	if(sum==i)
	 {
		System.out.println("sum of elements in an array:"+sum);
		     System.exit(0);
	 }
	}
    temp=sum;ld=0;sum1=0;
	   while(temp>0)	
	   { 
		   ld=temp%10;
		sum1=sum1+ld;
		temp=temp/10;
	   }
	   sum=sum1;
	}
   }
   }
