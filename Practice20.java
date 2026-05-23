package JavaPrograms;
import java.util.*;//another easy way to find the lcm of two numbers
public class Practice20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers to find gcd:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int big=0,small=0,n=0;
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
      n=big%small;
	while(n>0)
	{
		big=small;
		  small=n; 
		  n=big%small;
	  }
	System.out.println("gcd of two numbers:"+small);
	}

}

