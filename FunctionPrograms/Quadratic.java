package com.Bridgelabz.FunctionalProgram;
import java.util.*;


public class Quadratic{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input a : ");
		int a = sc.nextInt();
		System.out.print("Enter the input b : ");
		int b = sc.nextInt();
		System.out.print("Enter the input c : ");
		int c = sc.nextInt();
		calculateRoot(a , b , c);
		sc.close();
	}
	
	public static double calculateRoot(int a, int b, int c) {
		
		double delta;
		delta = Math.pow(b,2)-4*a*c;
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("the two roots of quadratic equation "+a+"x2 + "+b+"x + "+c+" are : "+root1+" , "+root2);
		return 0;
	}
}