package lab6;

import java.util.Scanner;

public class StringImage {

	public String getImage(String str) {
		StringBuffer a = new StringBuffer(str);
		a.append('|');
		
		StringBuffer b = new StringBuffer(str);
		b.reverse();
		
		a.append(b);
		
		return a.toString();
	}

	public static void main(String[] ar) {
		StringImage a = new StringImage();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.next();
		
		System.out.println(a.getImage(str));
	}

}
