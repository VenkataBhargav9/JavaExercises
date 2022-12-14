package lab5;

import java.util.Scanner;

public class NameException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstName = sc.next();
		String lastName = sc.next();
		
		try {
			if (firstName == "" || lastName == "") {
				sc.close();
				throw new Exception("Name should not be blank");
			}
			else {
				System.out.println(firstName);
				System.out.println(lastName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
