package JavaPrograms;
import java.util.*;//removing duplicate elements from an array
public class Practice30 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("enter size of array:");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 int temp[]=new int[n];
	 int k=0,count;
	 System.out.println("enter elements into the array:");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<n;i++)
	 {    
		 count=1;
		 for(int j=0;j<k;j++)
		 {
			 if(arr[i]==temp[j])
			 {
				 count++;
			 }
		 }
		 if(count==1)
		 {
			 temp[k]=arr[i];
			 k++;
		 }
		 
	 }
	 System.out.println("elements in the array after removing duplicate elements:");
	 for(int i=0;i<k;i++)
	 {
		 System.out.println(temp[i]);
	 }
	 
  }

}
