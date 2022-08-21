package lab1;

import java.util.Scanner;

public class IncreasingNumber {
	
	 static void checkNumber(int n) {
		int beforeDig= n%10,rem;
		int temp=n;
		temp=temp/10;
		while (temp>0){
			rem=temp%10;
			if(rem<beforeDig) {
				temp=temp/10;
				rem=beforeDig;
			}
			else {
				break;
			}
			
			
		}
		if(temp==0) {
			System.out.println(n + " is a Increasing number");
		}
		else {
			System.out.println(n  + " is not a Increasing number");
		}
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkNumber(n);
	}

}
