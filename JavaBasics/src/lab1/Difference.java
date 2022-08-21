package lab1;

import java.util.Scanner;

public class Difference {

	public static int differenceSquares(int n) {
		
		int s1=0,s2;
		for(int i=1;i<=n;i++) {
			s1=s1+i*i;
		}
	   s2=n*n*(n+1)*(n+1)/4;
		return s1-s2;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Differnce of squares is:" + differenceSquares(n));
		
	}
}
