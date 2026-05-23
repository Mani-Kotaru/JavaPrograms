package JavaPrograms;
import java.util.*;
import java.lang.*;
public class Practice {
	//iterating switch-case block upto n times or until selecting exit option
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value to iterate the switch block:");
		int n=sc.nextInt();
		System.out.println("enter two integers:");
		float a=sc.nextFloat(); 
		float b=sc.nextFloat();
		while(n>0)
		{
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Power\n7.Exit");
		    System.out.println("enter your option:");
		    int op=sc.nextInt();
			switch(op)
			{
			case 1:System.out.println("Addition of two numbers:"+(a+b));
			   break;
			case 2:System.out.println("Subtraction of two numbers:"+(a-b));
		       break;
			case 3:System.out.println("Multiplication of two numbers:"+(a*b));
		       break;
			case 4:System.out.println("Division of two numbers:"+(a/b));
		       break;
			case 5:System.out.println("Modulus of two numbers:"+(a%b));
		       break;
			case 6:System.out.println("Power of two numbers:"+Math.pow(a,b));
		       break;
			case 7:System.out.println("Exit");
				System.exit(0);//used to terminate the entire JVM and the running program
		       break;
		      default:System.out.println("You hava not selected any option from the given list");
			}
		}
		
	}
}
