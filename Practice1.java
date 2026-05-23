package JavaPrograms;
import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
		//power of a number without using Math function
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and exponent");
		int b=sc.nextInt();
		int e=sc.nextInt();
		int p=1;
		for(int i=0;i<e;i++)
		{
			p=p*b;
		}
System.out.println(b+" power "+e+" = "+p);
	}

}
