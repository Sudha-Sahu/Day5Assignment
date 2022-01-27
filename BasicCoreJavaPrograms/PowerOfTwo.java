package javaProgram;
import java.util.*;

public class PowerOfTwo {

	public static void main(String[] args) {
		int num=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the power of 2 : ");
		int val = sc.nextInt();
		for(int i=1;i<=val;i++) {
			num = num*2;
		}
		System.out.println("Power of 2 is : " +num);
	}
}