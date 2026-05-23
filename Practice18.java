package JavaPrograms;
import java.util.*;//gcd of two numbers using Euclidean algorithm
public class Practice18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter two numbers to find gcd:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int big=0,small=0,n=0;
	if(a>b)
     {big=a;
	small=b;}
    else	
	{big=b;
	small=a;}
	while(true)
	{
	  if(big%small==0)
	  {
		  System.out.println("gcd of two numbers:"+small);
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
