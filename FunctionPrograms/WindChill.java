package com.Bridgelabz.FunctionalProgram;
import java.util.*;


public class WindChill{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit : ");
		int t = sc.nextInt();
		System.out.print("Enter wind speed in miles per hour : ");
		int v = sc.nextInt();

		if( t>50 || v>120 || v<3 ) 
			System.out.println("invalid inputs");
		else 
			calculateWindChill(t , v);
		sc.close();
	}

	public static double calculateWindChill(int t, int v) {

		double temp;
		temp = 35.74 + 0.6215 * t + ( 0.4275 * t - 35.75) * Math.pow(v,0.16);

		System.out.println("WindChill : " + temp);
		return 0;
	}
}