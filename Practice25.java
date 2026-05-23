package JavaPrograms;
import java.util.*;//finding missing number in series 1,2,3,5,6,7,8,9
public class Practice25 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
  int arr[]=new int[100];
  System.out.println("enter number of terms in a series:");
    int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	arr[i]=sc.nextInt(); 
     }
     for(int i=0;i<n;i++)
     {
    	 if(arr[i+1]-arr[i]==2)
    	 {
    		 System.out.println("missing term in the given series is "+(arr[i]+1)+
    				 " and is between "+arr[i]+" and "+arr[i+1]);
    	 }
     }

	}

}
