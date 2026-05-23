package JavaPrograms;
import java.util.Scanner;//gcd of three numbers using Euclidean algorithm
public class Practice19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter two numbers to find gcd:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=0,small=0,n=0,g=0;
		if(a>b)
	     {
			big=a;
		small=b;
		}
	    else	
		{
	    	big=b;
		small=a;
		}
		while(true)
		{
		  if(big%small==0)
		  {
			 // System.out.println("gcd of two numbers:"+small);
			  g=small;
			    break;
		  }
		  else
		  { 
			  n=big%small;
			  big=small;
			  small=n;  
		  }
		}
		if(g>c)
	     {
			big=g;
		small=c;
		}
	    else	
		{
	    	big=c;
		small=g;
		}
		while(true)
		{
		  if(big%small==0)
		  {
			  System.out.println("gcd of 3 numbers:"+small);
			    break;
		  }
		  else
		  { 
			  n=big%small;
			  big=small;
			  small=n;  
		  }
		}
    

	}

}
