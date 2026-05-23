package JavaPrograms;

import java.util.Scanner;//finding lcm of 3 numbers in such a way that first finding the lcm of any two numbers
                         //and then finding the lcm of obtained lcm of 2 numbers and remaining number

public class Practice15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter three numbers to find their lcm:");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  int temp=0;
		  for(int i=1;i<=b;i++)
		  {
			  for(int j=1;j<=a;j++)
			  {
				  if(a*i==b*j)
				  {
					temp=a*i;
					//System.exit(0);
					i=b+1;
					j=a+1;
				  }
			  }
		 }
		  for(int i=1;i<=c;i++)
		  {
			  for(int j=1;j<=temp;j++)
			  {
				  if(temp*i==c*j)
				  {
					  System.out.println(temp*i);
					  System.exit(0);
				  }
			  }
		  }

	}

}
