package javaProgram;
import java.util.*;

public class ComputeQnR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Dividend : ");
		int dividend = sc.nextInt();
		System.out.print("Enter the Divisor : ");
		int divisor = sc.nextInt();
		double quotient=dividend / divisor;
		int remainder=dividend % divisor;
		System.out.println("The Quotient is: "+quotient);
		System.out.println("The Remainder is: "+remainder);
	}
}