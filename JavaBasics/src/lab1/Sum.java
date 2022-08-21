package lab1;

import java.util.Scanner;

public class Sum {
	
	
	public static int calculateSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the Number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		//sc.nextLine();
		
		System.out.println("Sum of the numbers divisible by 3 or 5 is:"+calculateSum(num));
		
	}

}
