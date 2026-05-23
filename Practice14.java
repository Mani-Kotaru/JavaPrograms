package JavaPrograms;
import java.util.Scanner;//finding lcm of 4 numbers by identifying the least multiple which is common in all 4 numbers
public class Practice14 {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter four numbers to find their lcm:");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  int d=sc.nextInt();
		  for( int i=1;i<=b*c*d;i++)
		  {
			  for(int j=1;j<=a*c*d;j++)
			  {
				  for(int k=1;k<=a*b*d;k++)
				  {
					  for(int l=1;l<=a*b*c;l++)
					  {
						  
				  if((a*i==b*j)&&(a*i==c*k)&&(a*i==d*l))
				  {
					System.out.println(a*i);
					System.exit(0);
				/*	i=b*c*d+1;
					j=a*c*d+1;
					k=a*b*d+1;
					l=a*b*c+1;*/
				  }
			  }
		 }	

	}

}
}
}
