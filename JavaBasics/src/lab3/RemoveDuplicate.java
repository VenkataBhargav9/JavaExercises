package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
	
	
	public static int modifyArray(int array[], int n){
	if(n==0 || n==1){
	return n;
	}
	int[] temp = new int[n];
	int j = 0;
	for (int i=0; i<n-1; i++){
	if(array[i] != array[i+1]){
	temp[j++] = array[i];
	}
	}
	temp[j++] = array[n-1];
	for(int i=0; i<j; i++){
	array[i] = temp[i];
	}
	return j;
	}
	public static void main (String[] args) {

		System.out.println("Enter the size of the array: ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
	Arrays.sort(array);
	int length = array.length;
	length = modifyArray(array, length);
	for(int i=length-1; i>=0; i--)
	System.out.print(array[i]+" ");
	}
}