package JavaPrograms;
import java.util.*;//Java program to build nummber guessing game
import java.math.*;
public class Practice31 {
public static void numberGuessingGame()
{
		int number=1+(int)(100*Math.random());//generates random number between 1 and 100
		int k=5;//no of attempts in each round
		int attempts=0,rounds=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		for(int i=0;i<k;i++)
		{  
			attempts++;
			System.out.println("enter your guessed number:");
			int guess=sc.nextInt();
			if(guess==number) {
				System.out.println("congratulations! you have guessed the number in "+attempts+" attempts");
				return;
			}
			else if(guess<number)
			{
				System.out.println("your guess is less than actual number");
			}
			else
			{
				System.out.println("your guess is greater than actual number");
			}
		}
		rounds++;
		
		System.out.println("Your "+rounds+" round is completed.Do you want to continue?(yes/no):");
		String response=sc.next();
		if(response.equalsIgnoreCase("no"))
		{
		 System.out.println("the actual number is:"+number);
		 break;
		}
}
	
}
public static void main(String args[])
{
	numberGuessingGame();
}

}
