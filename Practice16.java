package JavaPrograms;
import java.util.*; //easier way to find lcm of 3 numbers
import java.lang.*;
public class Practice16 {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter three numbers:");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int max=Math.max(a,b);
     int min=Math.min(a,b);
     int lcm=0;
     for(int i=max; ;i=i+max)
     {
    	 if(i%min==0)
    	 {
    		 lcm=i;
    		 break;
    	 }
     }
     max=Math.max(lcm,c);
     min=Math.min(lcm,c);
     for(int i=max; ;i=i+max)
     {
    	 if(i%min==0)
    	 {
    		System.out.println("lcm of three numbers:"+i);
    		 break;
    	 }
     }
	}

}
