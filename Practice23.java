package JavaPrograms;
import java.util.Scanner;//finding gcd of two numbers using lcm

public class Practice23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter two numbers to find their lcm:");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int i=0,t1=a,t2=b,lcm=0;
		  for(i=1;i<=b;i++)
		  {
			  for(int j=1;j<=a;j++)
			  {
				  if(a*i==b*j)
				  {
					System.out.println("lcm of two numbers:"+a*i);
					lcm=a*i;
					//System.exit(0);
					i=b+1;
					j=a+1;
				  }
			  }
		 }
		  int gcd=0;
		  gcd=(t1*t2)/lcm;
		  System.out.println("gcd of two numbers:"+gcd);

	}

}
