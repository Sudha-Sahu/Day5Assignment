package javaProgram;
import java.util.*;

public class FlipCoin {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the value that how many times you want to flip a coin: ");
		float noOfTimes=num.nextInt();
		int countHead=0,countTail=0;
		float calPercentHead,calPercentTail;
		double flip;
		Random random=new Random();
		
		for(int i=1; i<=noOfTimes; i++ ) {
			flip = random.nextDouble();
			if(flip < 0.5)
				countTail+=1;
			else
				countHead+=1;
			
		}
		System.out.println("Total number of heads are:  "+countHead+"  and number of Tails are:   "+countTail);
		calPercentTail=((float)(countTail/noOfTimes))*100;
		calPercentHead=((float)(countHead/noOfTimes))*100;
		System.out.println("Percentage of Heads:  "+calPercentHead+"%  vs Pencentage of Tails is:  "+calPercentTail+"%");
	}
}
