package javaProgram;
import java.util.*;

public class LargestOf3 {
	public static void main(String[] args) {

		int x, y, z;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number:");
		x = sc.nextInt();
		System.out.print("Enter the second number:");
		y = sc.nextInt();
		System.out.print("Enter the third number:");
		z = sc.nextInt();

		if(x > y)
		{
			if(x > z)
				System.out.println("Largest number is:"+x);
			else
				System.out.println("Largest number is:"+z);
		}
		else 
		{
			if(y > z)
				System.out.println("Largest number is:"+y);
			else
				System.out.println("Largest number is:"+z);
		}
	}   
}