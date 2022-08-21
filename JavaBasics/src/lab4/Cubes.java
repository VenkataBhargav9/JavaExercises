package lab4;

import java.util.Scanner;

public class Cubes {
	
	static int cubeSum(int n) {
		int sum=0;
		while(n!=0) {
			sum=sum+((n%10)*(n%10)*(n%10));
			n=n/10;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(cubeSum(n));
		
	}

}
