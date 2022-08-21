package lab5;

import java.util.Scanner;

public class Fibonacci {
	static int recursiveFibonacci(int n) {
		if(n==1)
			return 1;
		else if(n==2)
			return 1;
		else
		return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
	static int nonrecursiveFibonacci(int m) {
		
		if(m==1)
			return 1;
		if(m==2)
			return 1;
		
		int a=1,b=2;
		int[] arr= new int[m];
		arr[0]=a;
		arr[1]=b;
		int i=2,temp=0;
		while(i<m) {
			temp=a+b;
			arr[i]=temp;
			a=b;
			b=temp;
			i++;
		}
		
		return arr[m-2];
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Fibonacci series in non recursive form is: " +nonrecursiveFibonacci(n));
		System.out.println("Fibonacci series in recursive form is: " +recursiveFibonacci(n));
	}

}
