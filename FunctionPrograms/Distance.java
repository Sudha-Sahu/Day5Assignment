package com.Bridgelabz.FunctionalProgram;
import java.util.*;


public class Distance{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integer x and y : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double distance = euclidean(x , y);
		System.out.println("The Euclidean Distance from the points ("+x+","+y+") to the origin (0,0) is : "+distance);
		sc.close();
	}
	
	public static double euclidean(int x, int y) {
		
		double dis;
		dis = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return dis;
	}
}