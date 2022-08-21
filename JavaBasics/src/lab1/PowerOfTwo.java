package lab1;

import java.util.Scanner;

public class PowerOfTwo {
 static boolean checkNum(int n) {
	 while(n>1) {
		 if(n%2!=0) {
			 return false;
		 }
		 n=n/2;
		 
		 
	 }
	 return true;
	
	 
 }
 public static void main(String[] args) {
	System.out.println("Enter a number:");
	Scanner sc =new Scanner(System.in);
	int n= sc.nextInt();
	boolean val =checkNum(n);
	if(val==true) {
		System.out.println(n+" is power of 2");
	}
	else {
		System.out.println(n+" is not power of 2");
	}
}
}
