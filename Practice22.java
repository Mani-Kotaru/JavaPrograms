package JavaPrograms;
import java.util.*;//finding lcm of two numbers using gcd
                   //lcm * gcd = num1 * num2
public class Practice22 {
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
	int lcm=0;
	lcm=(a*b)/small;
	System.out.println("lcm of two numbers:"+lcm);

	}

}
