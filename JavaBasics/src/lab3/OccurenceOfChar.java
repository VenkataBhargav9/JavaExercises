package lab3;

import java.util.HashMap;
import java.util.Scanner;

public class OccurenceOfChar {
	
	static void freqChar(String str) {
		
		
		 HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		
		freqChar(str);
		
	}

}
