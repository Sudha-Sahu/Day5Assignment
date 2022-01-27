package javaProgram;
import java.util.*;

public class PrimeFactors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.print("Prime Factorization of "+num +" are: ");
		for(int i = 2; i< num; i++) {
			while(num%i == 0) {
				System.out.print(i+"  ");
				num = num/i;
			}
		}
		if(num >2) 
			System.out.println(num);
	}
}
