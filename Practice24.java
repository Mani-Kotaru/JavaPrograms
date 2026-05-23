package JavaPrograms;
import java.util.*;//finding min and max digit in the given number
public class Practice24 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int t1=n,t2=n,min=0,max=0,j=0;
		int arr[]=new int[100];
		while(t1>0)
		{
			arr[j]=t1%10;
			j++;
			t1=t1/10;
		}
		min=arr[0];
		for(int i=1;i<j-1;i++)
		{   
			if(arr[i+1]<min)
			{
				min=arr[i+1];
			}
			
		}
		System.out.println("min digit in the number:"+min);
		max=arr[0];
	for(int i=0;i<j-1;i++)
		{   
			if(arr[i+1]>max)
			{
				max=arr[i+1];
			}
			
		}
		System.out.println("max digit in the number:"+max);
		}

}
