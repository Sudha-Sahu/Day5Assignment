package javaProgram;
import java.util.*;

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner year = new Scanner(System.in);
		System.out.print("Enter the year in four digit only: ");
		int inputYear=year.nextInt();
		if(((inputYear%4==0) && (inputYear%100!=0)) || (inputYear%400==0))
			System.out.println("given year is a Leap Year!!!");
		else
			System.out.println("given year is not a Leap Year!!!");
	}
}
