package lab5;

import java.util.Scanner;

public class PersonAge {
	
          
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.close();
		try {
			if (age < 15) {
				throw new Exception("Age should be greater than 15");
			} else {
				System.out.print("age is: ");
				System.out.println(age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
