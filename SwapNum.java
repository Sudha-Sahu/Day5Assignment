package javaProgram;
import java.util.Scanner;

class SwapNum {
	public static void main(String[] args) {

		int x, y;
		int swap;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and Y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swapping X and Y are: "+x +"  "+ y);

		swap = x;
		x = y;
		y = swap;
		System.out.println("After swapping X and Y are: "+x +"   " + y);
		System.out.println( );
		sc.close();
	}
}