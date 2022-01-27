package javaProgram;
import java.util.Scanner;

public class HarmonicNum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number for nth Harmonic number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i!=n)
			{
				System.out.print("1/"+i+"+");
			}
			else
			{
				System.out.print("1/"+i);
			}
		}
	}
}