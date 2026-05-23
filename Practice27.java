package JavaPrograms;
import java.util.*;//finding duplicate number in an array
public class Practice27 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array:");
		int n=sc.nextInt();
		int arr[]=new int[100];
		int arr1[]=new int[100];
	   int flag[]=new int[100];
		int count=0,c=0;
		System.out.println("enter elements into the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{  count=0;
			for(int j=0;j<n;j++)
			{  
				if(arr[i]==arr[j])
				{   
					count++;
					
				}
			}
			arr1[i]=count;
		 }
        for(int i=0;i<n;i++)
        {   if(arr1[i]==1)
           {
        	  c++;
           }
        }
        if(c==n)
        {
        	System.out.println("there is no duplicate elements in the array");
        }
        else
        {
        	System.out.println("there is "+(n-c)/2+" duplicate element in the array");
        }
		for(int i=0;i<n;i++)
		{   
		   	if(flag[arr[i]]==0)
		   	{
			if(arr1[i]>1)
			{
				System.out.println("duplicate number:"+arr[i]+" and is appeared "+arr1[i]+" times");
				flag[arr[i]]=1;
			}
			
		}
		
		}
		
		
	}

}
