package JavaPrograms;
import java.util.*;//finding  lcm of two numbers by identifying least multiple which is common in both numbers
public class Practice13 {
    public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter two numbers to find their lcm:");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int i=0;
	  for(i=1;i<=b;i++)
	  {
		  for(int j=1;j<=a;j++)
		  {
			  if(a*i==b*j)
			  {
				System.out.println("lcm of two numbers:"+a*i);
				//System.exit(0);
				i=b+1;
				j=a+1;
			  }
		  }
	 }
	  
	}

}

