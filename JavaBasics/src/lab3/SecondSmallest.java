package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	
	static int secondSmallestArray(int[] arr ){
		Arrays.sort(arr);
		return arr[1];
		
	}
	public static void main(String[] args) {
		
		
		System.out.println("Enter the array Size: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Second Smallest Element is: "+secondSmallestArray(arr) );
		
	}

}
