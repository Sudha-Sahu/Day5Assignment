package com.Bridgelabz.FunctionalProgram;
import java.util.Scanner;
import java.io.*;

public class Print2DArray{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows for 2DArray : ");
		int row = sc.nextInt();

		System.out.print("Enter the number of column for 2DArray : ");
		int col = sc.nextInt();
		twoDArray(row , col);
	}
	public static void twoDArray(int r, int c) {

		Scanner input = new Scanner(System.in);
		int array[][]=new int[r][c];
		PrintWriter p = new PrintWriter(System.out);
		for (int i=0;i<r;i++) {
			System.out.println("enter the element in "+i+"th row of array:  ");
			for(int j=0;j<c;j++) {
				array[i][j]= input.nextInt();
			}
		}
		p.println("The matrix representation of 2D array are : ");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				p.print(" "+array[i][j]+" ");
			}
			p.println("");
		}
		p.close();
	}
}