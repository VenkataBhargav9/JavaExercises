package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	
	static int reverse(int n) {
		int temp = 0;
		while(n>0) {
			temp=temp*10+n%10;
			n/=10;
		}
		return temp;
	}
	static int getSorted(int[] a) {
		System.out.println("Enter the size of array: ");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr =new int[n];
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			
			arr1[i]=reverse(arr[i]);
			
		}
		
		Arrays.sort(arr1);
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		
		
		
		return 0;
	}
	public static void main(String[] args) {
		
		int[] a = null ;
		getSorted(a);
		
	}
}
